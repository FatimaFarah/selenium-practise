package com.connect_group.tests.bbcnews;

import com.connect_group.tests.BaseIT;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class bbcNews extends BaseIT {

  //@before will run before every single individual @ test
  //url needs https:/

  @Before
  public void navigateURL() {
    getDriver().get("https://www.bbc.co.uk/news");
  }

  @Test
  public void ensureWeCanLoadMainNewsArticle(){
    WebElement topLink = getDriver().findElement(By.xpath("//*[@id=\"nw-c-topstories-domestic\"]/div/div/div[1]/div/div[1]/div/div/div[1]/div/a"));
    topLink.click();

    String pageTitle = getDriver().getTitle();
    String pageUrl = getDriver().getCurrentUrl();

    assertEquals("Coronavirus: Widespread transmission in UK 'highly likely' - BBC News", pageTitle);
    assertEquals("https://www.bbc.co.uk/news/uk-51700604", pageUrl);
  }
}