package com.bbc.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[6]/div/div/a/div/h2")
    public WebElement newsheadlines;


    @FindBy(xpath = "/span[contains(@class,'gs-o-bullet__icon gel-icon gs-c-comment-count__icon')]" )
    public List<WebElement> articles;


}
