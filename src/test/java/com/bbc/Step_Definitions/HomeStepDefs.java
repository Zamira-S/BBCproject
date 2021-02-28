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
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeStepDefs {
    HomePage homepage = new HomePage();
    CommentPage commentpage = new CommentPage();
    WebElement articlecomment;

    @Given("The user is on the main page of BBC.")
    public void the_user_is_on_the_main_page_of_BBC() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user should click a Top News Headline.")
    public void the_user_should_click_a_Top_News_Headline() {
        BrowserUtils.scrollToElement(homepage.newsheadlines);
        homepage.newsheadlines.click();
     BrowserUtils.waitFor(4);

    }

    @Then("The user checks if the comments can be viewed for the {string}.")
    public void the_user_checks_if_the_comments_can_be_viewed_for_the(String string) {
  List<WebElement>articles=homepage.articles;

        for (WebElement article: articles) {
            System.out.println("List<>");
            boolean articlecomments = article.isDisplayed();
            boolean isDisplayed = Driver.get().findElement(By.xpath("//span[contains(@class,'gs-o-bullet__icon gel-icon gs-c-comment-count__icon')]")).isDisplayed();
            if(articlecomments)
            {
                System.out.println("Comment is viewable");
            articlecomment= article;
            }else
             {
             System.out.println("Comment is not viewable");

             }
        }
    }
    @Then("The user should be able to click News article.")
    public void the_user_should_be_able_to_click_News_article() {
        Driver.get().findElement(By.xpath("//span[contains(@class,'gs-o-bullet__icon gel-icon gs-c-comment-count__icon')]")).click();


    }

    @Then("The user verifies if the commenting is enabled.")
    public void the_user_verifies_if_the_commenting_is_enabled() {
        BrowserUtils.scrollToElement(commentpage.comment);
        commentpage.comment.click();
        String actual= Driver.get().findElement(By.xpath("//h4[contains(@class,'comments__heading-module-title')]")).getText();
        Assert.assertEquals("Comments",actual);
    }
}

















