package com.connect_group.pages.Mashable;

import com.connect_group.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MashableHomepage extends BasePage {


  public MashableHomepage(WebDriver driver) {
    super(driver);
  }

  public WebElement clickPrimaryArticle() {
    return getDriver().findElement(By.cssSelector("#highlights-primary"));
  }


}
