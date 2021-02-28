package com.bbc.Step_Definitions;

import com.bbc.Pages.SignInPage;
import com.bbc.Utilities.BrowserUtils;
import com.bbc.Utilities.ConfigurationReader;
import com.bbc.Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignInStepDefs {
    SignInPage signIn = new SignInPage();
    Faker faker= new Faker();

    @When("The user click to sign in.")
    public void the_user_click_to_sign_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        signIn.sign.click();

    }

    @Then("The user should be able write user name.")
    public void the_user_should_be_able_write_user_name() {
        signIn.email.sendKeys(faker.internet().emailAddress());

    }

    @Then("The user should be able to write password.")
    public void the_user_should_be_able_to_write_password() {
        signIn.password.sendKeys(faker.internet().password());

    }

    @Then("The user should be able to click sign in button.")
    public void the_user_should_be_able_to_click_sign_in_button() {
        signIn.signinbutton.click();

    }

}
