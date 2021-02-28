package com.bbc.Pages;

import com.bbc.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[7]/div/div/a/div/h2")
    public WebElement sportheadlines;
   // @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[6]/div/div/a/div/h2")
   // public WebElement newsheadlines;

   // public void menuget(String menu) {
       // Driver.get().findElement(By.xpath("//h5[(contains(text()),'" + menu + "']")).click();

    }
//}
