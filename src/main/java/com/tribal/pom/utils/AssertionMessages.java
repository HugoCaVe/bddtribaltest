package com.tribal.pom.utils;

public enum AssertionMessages {
  ERROR_MESSAGE_NOT_MATCH("Error, no coinciden los valores "),
  ERROR_VALUE_NOT_FOUND("Error, valor no encontrado "),
  ERROR_THE_CREDIT_VALUE_MUST_BE_HIGHER("El valor del credito debe ser superior de: "),
  ERROR_THE_MINIMUN_INCOME_VALUE_MUST_BE("El valor del ingreso mínimo debe ser: "),
  EXPECTED_VALUE(" valor esperado "),
  VALUE_SHOWN(" valor mostrado: ");

  private String value;

  AssertionMessages(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
