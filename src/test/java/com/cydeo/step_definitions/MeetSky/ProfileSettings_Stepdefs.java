package com.cydeo.step_definitions.MeetSky;

import com.cydeo.pages.MeetSky.ProfileSettingsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ProfileSettings_Stepdefs {
ProfileSettingsPage page = new ProfileSettingsPage();

    @Given("Click on Profile Settings")
    public void click_on_profile_settings() {

        BrowserUtils.sleep(3);
       page.AvatarForProfileSettings.click();
    }
    @Given("Click on Settings")
    public void click_on_settings() {
        BrowserUtils.sleep(3);
        page.Settings.click();

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        BrowserUtils.sleep(5);
        String actualName = page.FullNameInput.getAttribute("value");
        Assert.assertEquals(actualName, string);

    }


    @Then("Verify  email {string} is visible")
    public void verifyEmailIsVisible(String string) {

        BrowserUtils.sleep(3);
        String actualEmail = page.emailInput.getAttribute("value");
        Assert.assertEquals(actualEmail, string);
    }

    @Then("Verify  Phone Number {string} is visible")
    public void verifyPhoneNumberIsVisible(String string) {

        BrowserUtils.sleep(3);
        String actualEmail = page.phoneInput.getAttribute("value");
         Assert.assertEquals(actualEmail, string);
    }

    @And("clear the placeholder")
    public void clearThePlaceholder() {
        BrowserUtils.sleep(3);
        page.FullNameInput.clear();
    }

    @And("type new Full name {string}")
    public void typeNewFullName(String string) {
        BrowserUtils.sleep(3);
        page.FullNameInput.sendKeys(string);
        page.FullNameInput.sendKeys(Keys.ENTER);
    }


    @Then("Verify  {string} is visible")
    public void verifyIsVisible(String string) {
        BrowserUtils.sleep(3);
        String actualName = page.FullNameInput.getAttribute("value");
        Assert.assertEquals(actualName, string);

    }

    @And("Click dropdown next to Phone Number")
    public void clickDropdownNextToPhoneNumber() {
        BrowserUtils.sleep(3);
        page.DropdownByPhoneNumber.click();
    }

    @And("click private")
    public void clickPrivate() {
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.privateMode);
        System.out.println("Private Mode selected");
    }

    @Then("verify phone number is private")
    public void verifyPhoneNumberIsPrivate() {
        BrowserUtils.sleep(3);
        page.privateModeSelected.isEnabled();
    }

    @Then("Verify Local time is visible")
    public void verifyLocalTimeIsVisible() {
        page.localTime.isDisplayed();
    }
}













