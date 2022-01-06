package com.tribal.pom.definitions;

import com.tribal.pom.steps.CurrentJobOpeningsStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CurrentJobOpeningsDefinitions {

  @Steps CurrentJobOpeningsStep currentJobOpeningsStep;

  @Dado("que se ingresó a la página de ofertas de trabajo actuales de Tribal Credit")
  public void enterThePage() {
    currentJobOpeningsStep.shouldInstantiatedPageObjectsForAWebTest();
  }

  @Dado("que se valida que se cargue la información de la página")
  public void validatePageinformation() {
    currentJobOpeningsStep.validateScreenInformation();
  }

  @Cuando("selecciono (.*) en el campo Department$")
  public void enterDepartment(String department) {
    currentJobOpeningsStep.showDepartmentOption(department);
  }

  @Cuando("en el campo Office selecciono (.*)$")
  public void enterOffice(String office) {
    currentJobOpeningsStep.showOfficeOption(office);
  }

  @Cuando("en el campo Department filtro por (.*)$")
  public void filterByDepartment(String department) {
    currentJobOpeningsStep.showDepartmentOption(department);
  }

  @Cuando("en el campo Office por (.*)$")
  public void filterByOfficet(String office) {
    currentJobOpeningsStep.showOfficeOption(office);
  }

  @Entonces("se muestra por pantalla la posición (.*)$")
  public void validateJobs(String jobs) {
    currentJobOpeningsStep.validationOfAvailableJobs(jobs);
  }

  @Entonces("se muestran las opciones seleccionadas$")
  public void viewOptionsOnScreen() {
    currentJobOpeningsStep.validateOptionsLoadedByScreen();
  }
}
