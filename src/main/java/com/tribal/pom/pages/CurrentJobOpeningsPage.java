package com.tribal.pom.pages;

import com.tribal.pom.utils.Utilities;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://boards.greenhouse.io/tribalcredit")
public class CurrentJobOpeningsPage extends PageObject {

  @FindBy(id = "s2id_departments-select")
  private WebElementFacade optDepartment;

  @FindBy(id = "s2id_offices-select")
  private WebElementFacade optOffice;

  public void selectDepartmentOption(String department) {
    getDriver()
        .findElement(
            By.xpath("//ul[@id='select2List0']/li/div[contains(string(), '" + department + "')]"))
        .click();
  }

  public void selectSpecialDepartmentOption() {
    getDriver()
        .findElement(
            By.xpath(
                "//ul[@id='select2List0']/li/div[contains(string(),\"You Don't See a Role You're Interested In?\")]"))
        .click();
  }

  public void selectOptionOffice(String office) {
    getDriver()
        .findElement(
            By.xpath("//ul[@id='select2List1']/li/div[contains(string(), '" + office + "')]"))
        .click();
  }

  public boolean getDepartmentDisplay(String department) {
    return getDriver()
        .findElement(
            By.xpath(
                "//div[@id='s2id_departments-select' and contains(string(), '"
                    + department
                    + "')]"))
        .isDisplayed();
  }

  public boolean seeSpecialDepartmentOnScreen() {
    return getDriver()
        .findElement(
            By.xpath(
                "//div[@id='s2id_departments-select' and contains(string(),\"You Don't See a Role You're Interested In?\")]"))
        .isDisplayed();
  }

  public boolean getOfficeDisplay(String office) {
    return getDriver()
        .findElement(
            By.xpath("//div[@id='s2id_offices-select' and contains(string(), '" + office + "')]"))
        .isDisplayed();
  }

  public boolean validateDepartment() {
    return optDepartment.isDisplayed();
  }

  public boolean validateOffice() {
    return optDepartment.isDisplayed();
  }

  public void selectDepartment() {
    optDepartment.waitUntilClickable().click();
  }

  public void selectOffice() {
    optOffice.waitUntilClickable().click();
  }

  public boolean lookForAvailableWork(String jobs, String office) {
    WebElement element =
        getDriver()
            .findElement(
                By.xpath(
                    "//div[contains(string(), '"
                        + jobs
                        + "')]/span[contains(string(),'"
                        + office
                        + "')]"));
    Utilities.moveScroll(element);
    return element.isDisplayed();
  }

  public boolean getJobsInformation(String jobs) {
    WebElement element =
        getDriver()
            .findElement(
                By.xpath("//div[@office_id= 4001859004 and contains(string(), '" + jobs + "')]"));
    Utilities.moveScroll(element);
    return element.isDisplayed();
  }
}
