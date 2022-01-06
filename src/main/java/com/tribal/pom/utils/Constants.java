package com.tribal.pom.utils;

public enum Constants {
  SPECIAL_OPTION("You Don't See a Role You're Interested In?"),
  MEXICO("Mexico");

  private String value;

  Constants(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
