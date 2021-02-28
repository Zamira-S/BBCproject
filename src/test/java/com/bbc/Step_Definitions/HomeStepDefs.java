package com.bbc.Step_Definitions;

import com.bbc.Pages.CommentPage;
import com.bbc.Pages.HomePage;
import com.bbc.Utilities.BrowserUtils;
import com.bbc.Utilities.ConfigurationReader;
import com.bbc.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomeStepDefs {

    Driver driver;
    HomePage homepage = new HomePage();
    CommentPage commentpage = new CommentPage();

    @Given("The user is on the main page of BBC.")
    public void the_user_is_on_the_main_page_of_BBC() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user should click a Top News Headline.")
    public void the_user_should_click_a_Top_News_Headline() {
       // BrowserUtils.scrollToElement(homepage.newsheadlines);
      //  homepage.newsheadlines.click();
        BrowserUtils.scrollToElement(homepage.sportheadlines);
        homepage.sportheadlines.click();


    }

    @Then("The user checks if the comments can be viewed for the article.")
    public void the_user_checks_if_the_comments_can_be_viewed_for_the_article() {
        boolean isDisplayed = Driver.get().findElement(By.xpath("(//span[@class='gs-o-bullet__icon gel-icon gs-c-comment-count__icon nw-c-comment__icon'])[1]")).isDisplayed();

        if(isDisplayed)
        {
            System.out.println("Comment is viewable");

        }else
        {
            System.out.println("Comment is not viewable");
        }

    }






    @Then("The user should be able to click News article.")
    public void the_user_should_be_able_to_click_News_article() {
        homepage.commentsign.click();

    }

    @Then("The user verifies if the commenting is enabled.")
    public void the_user_verifies_if_the_commenting_is_enabled() {
        BrowserUtils.scrollToElement(commentpage.comment);
        commentpage.comment.click();
        boolean isEnabled = Driver.get().findElement(By.xpath("(/html/body/div[4]/div[3]/div/div/div[1]/article/div[2]/div/div/div[2]/div/span/div/div[1]/h4[1])")).isDisplayed();

        if(isEnabled)
        {
        System.out.println("Comment is enable");

        }else
        {
        System.out.println("Comment is not enable");
        }


        }


        }













