package com.bbc.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentPage extends BasePage {

    @FindBy(xpath = "(/html/body/div[4]/div[3]/div/div/div[1]/article/div[2]/div/div/div[1]/span/div/button)")
    public WebElement comment;

    @FindBy(xpath = "(/html/body/div[4]/div[3]/div/div/div[1]/article/div[2]/div/div/div[2]/div/span/div/div[1]/h4[1])" )
    public WebElement verifycomment;
}

