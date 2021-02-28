package com.bbc.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentPage extends BasePage {


    @FindBy(xpath = "//button[@class='view-comments-button']")
    public WebElement comment;

}

