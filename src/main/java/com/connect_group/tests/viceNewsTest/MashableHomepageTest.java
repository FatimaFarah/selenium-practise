package com.connect_group.tests.viceNewsTest;

import com.connect_group.tests.BaseIT;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MashableHomepageTest extends BaseIT {

  private MashableHomepageTest MashableHomepageTest;

  public MashableHomepageTest(WebDriver driver) {
    super();
  }

  @Before
  public void setUp() {
    MashableHomepageTest = new MashableHomepageTest(driver);
    getDriver().get("https://mashable.com");
  }

  @Test
  public void clickPrimaryArticle() {
    MashableHomepageTest.clickPrimaryArticle();

  }


}
