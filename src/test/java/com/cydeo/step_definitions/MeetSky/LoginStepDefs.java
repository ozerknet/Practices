package com.cydeo.step_definitions.MeetSky;

import com.cydeo.pages.MeetSky.BasePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    BasePage loginPage=new BasePage();

    @When("user open login page")
    public void user_open_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlMeetSky"));
    }

    @Then("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetSkyUserName"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetSkyUserPwd"));
        loginPage.loginButton.click();

    }

    @Then("user see dashboard page")
    public void user_see_dashboard_page() {
        Assert.assertTrue(loginPage.meetSkyLogo.isDisplayed());
    }
}
