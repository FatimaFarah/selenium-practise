package com.connect_group.pages.govuk;

import com.connect_group.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public List<WebElement> getTopLinks() {
    return getDriver().findElements(By.cssSelector(".home-top__links-link"));
  }

  public WebElement getYesFeedbackPrompt() {
    return getDriver().findElement(By.cssSelector(".js-page-is-useful"));
  }

  public WebElement getNoFeedbackPrompt() {
    return getDriver().findElement(By.cssSelector(".js-page-is-not-useful"));
  }

  public void checkEachTopLinkHasText() {
    for (WebElement topLink : getTopLinks()) {
      //System.out.println(topLink.getText());
      assertNotNull(topLink.getText());
    }
  }

  public void checkEachTopLinkHasAHref() {
    for(WebElement link : getTopLinks()) {
      String linkHref = link.getAttribute("href");
      //System.out.println(linkHref);
      assertNotNull(linkHref);
    }
  }

  public void clickYesFeedbackPrompt() {
    actions().moveToElement(getYesFeedbackPrompt()).perform();
    until(ExpectedConditions.elementToBeClickable(getYesFeedbackPrompt())).click();
  }

  public void clickNoFeedbackPrompt() {

  }
}