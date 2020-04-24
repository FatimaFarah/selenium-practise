package com.connect_group.tests.govuk;

import com.connect_group.pages.govuk.HomePage;
import com.connect_group.tests.BaseIT;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class HomePageTest extends BaseIT {

  private HomePage homePage;

  @Before
  public void setup() {
    homePage = new HomePage(driver);
    getDriver().get("https://www.gov.uk/");
  }

  @Test
  public void methodsInPageObject() {
    homePage.checkEachTopLinkHasText();
    homePage.checkEachTopLinkHasAHref();
  }

  @Test
  public void forLoopWithinTest() {
    homePage.getTopLinks().forEach(link -> {
      assertNotNull(link.getText());
      assertNotNull(link.getAttribute("href"));
    });
  }

  @Test
  public void clickingYesPromptReturnsYesMessage() {
    homePage.clickYesFeedbackPrompt();

    //assertNotNull(homePage.getYesFeedbackPromptMessage().getText());
    //assertThat(homePage.getYesFeedbackPromptMessage().getText()), equalTo("Thank you for your feedback");
  }

  //get the text for the feedback prompt
  //test other aspects of the page
}