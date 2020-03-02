package com.connect_group.tests.helloworld;

import com.connect_group.tests.BaseIT;

import com.connect_group.pages.helloworld.ReceiptPage;
import com.connect_group.pages.helloworld.SignUpPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloWorld extends BaseIT {

  // Tutorial - https://pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests

  @Before
  public void navigateToURL() {
    getDriver().get("https://www.kimschiller.com/page-object-pattern-tutorial/index.html");
  }

  @Test
  public void helloWorldTest() {
    SignUpPage signUpPage = new SignUpPage(driver);
    assertTrue(signUpPage.isInitialized());

    signUpPage.enterName("First", "Last");
    signUpPage.enterAddress("123 Street", "12345");

    ReceiptPage receiptPage = signUpPage.submit();
    assertTrue(receiptPage.isInitialized());

    assertEquals("Thank you!", receiptPage.confirmationHeader());
  }
}