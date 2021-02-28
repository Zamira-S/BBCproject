package com.bbc.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(linkText = "Sign in")
    public WebElement sign;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@id='submit-button']")
    public WebElement signinbutton;
}
