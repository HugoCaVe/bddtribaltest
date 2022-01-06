package com.tribal.pom.utils;

public enum SessionVariables {
  DEPARTMENT_NAME("Nombre del departamento"),
  OFFICE_NAME("Nombre de la oficina");

  private String value;

  SessionVariables(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
