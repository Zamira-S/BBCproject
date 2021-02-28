package com.bbc.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
   // @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[6]/div/div/a/div/h2")
   // public WebElement newsheadlines;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[7]/div/div/a/div/h2")
    public WebElement sportheadlines;

    @FindBy(xpath = "(//span[@class='gs-t-sport gs-o-bullet gs-o-bullet- gs-c-comment-count']" )
    public WebElement commentsign;


}
