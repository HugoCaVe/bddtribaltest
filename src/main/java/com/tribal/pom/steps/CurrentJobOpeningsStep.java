package com.tribal.pom.steps;

import static com.tribal.pom.utils.AssertionMessages.ERROR_VALUE_NOT_FOUND;
import static com.tribal.pom.utils.Constants.MEXICO;
import static com.tribal.pom.utils.Constants.SPECIAL_OPTION;
import static com.tribal.pom.utils.SessionVariables.DEPARTMENT_NAME;
import static com.tribal.pom.utils.SessionVariables.OFFICE_NAME;
import static org.hamcrest.MatcherAssert.assertThat;

import com.tribal.pom.pages.CurrentJobOpeningsPage;
import com.tribal.pom.utils.Utilities;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CurrentJobOpeningsStep {

  @Page CurrentJobOpeningsPage currentJobOpeningsPage;

  @Step
  public void shouldInstantiatedPageObjectsForAWebTest() {
    currentJobOpeningsPage.open();
  }

  @Step
  public void validateScreenInformation() {
    assertThat(ERROR_VALUE_NOT_FOUND.getValue(), currentJobOpeningsPage.validateDepartment());
    assertThat(ERROR_VALUE_NOT_FOUND.getValue(), currentJobOpeningsPage.validateOffice());
  }

  @Step
  public void showDepartmentOption(String department) {
    currentJobOpeningsPage.selectDepartment();
    if (department.equals(SPECIAL_OPTION.getValue())) {
      currentJobOpeningsPage.selectSpecialDepartmentOption();
    } else {
      currentJobOpeningsPage.selectDepartmentOption(department);
    }
    Serenity.setSessionVariable(DEPARTMENT_NAME.getValue()).to(department);
  }

  @Step
  public void showOfficeOption(String office) {
    currentJobOpeningsPage.selectOffice();
    currentJobOpeningsPage.selectOptionOffice(office);
    Serenity.setSessionVariable(OFFICE_NAME.getValue()).to(office);
  }

  @Step
  public void validationOfAvailableJobs(String jobs) {
    if (Serenity.sessionVariableCalled(OFFICE_NAME.getValue()).equals(MEXICO.getValue())) {
      assertThat(ERROR_VALUE_NOT_FOUND.getValue(), currentJobOpeningsPage.getJobsInformation(jobs));
    } else {
      assertThat(
          ERROR_VALUE_NOT_FOUND.getValue(),
          currentJobOpeningsPage.lookForAvailableWork(
              jobs, Serenity.sessionVariableCalled(OFFICE_NAME.getValue())));
    }
    Utilities.waitTime(3);
  }

  @Step
  public void validateOptionsLoadedByScreen() {
    if (Serenity.sessionVariableCalled(DEPARTMENT_NAME.getValue())
        .equals(SPECIAL_OPTION.getValue())) {
      assertThat(
          ERROR_VALUE_NOT_FOUND.getValue(), currentJobOpeningsPage.seeSpecialDepartmentOnScreen());
    } else {
      assertThat(
          ERROR_VALUE_NOT_FOUND.getValue(),
          currentJobOpeningsPage.getDepartmentDisplay(
              Serenity.sessionVariableCalled(DEPARTMENT_NAME.getValue())));
      assertThat(
          ERROR_VALUE_NOT_FOUND.getValue(),
          currentJobOpeningsPage.getOfficeDisplay(
              Serenity.sessionVariableCalled(OFFICE_NAME.getValue())));
    }
  }
}
