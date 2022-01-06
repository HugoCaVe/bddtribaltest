package com.tribal.pom.utils;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Utilities {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
  protected static final Long TIME_ADD = Long.valueOf(1000);

  private Utilities() {}

  public static void waitTime(Integer totalTime) {
    try {
      Thread.sleep(totalTime * TIME_ADD);
    } catch (Exception e) {
      LOGGER.error("error en la espera" + e);
    }
  }

  public static void moveScroll(WebElement element) {
    Actions actions = new Actions(getDriver());
    actions.moveToElement(element);
    actions.perform();
  }
}
