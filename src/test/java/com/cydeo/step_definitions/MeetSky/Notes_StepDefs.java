package com.cydeo.step_definitions.MeetSky;

import com.cydeo.pages.MeetSky.BasePage;
import com.cydeo.pages.MeetSky.SkyNotePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Notes_StepDefs {

    BasePage basePage = new BasePage();
    SkyNotePage notePage = new SkyNotePage();

    Actions actions = new Actions(Driver.getDriver());
    String expectedText = "OZZZY";
    String expectedCategory = "Ozerk";

    // AC1 -----------------------------------------------------------------------------------------

    @Then("user click the pencil button on the top menu")
    public void user_click_the_pencil_button_on_the_top_menu() {
        notePage.noteButton.click();

    }

    @Then("user click the New note button on the left menu")
    public void user_click_the_new_note_button_on_the_left_menu() {

        notePage.newNoteButton.click();
    }

    @Then("user write notes inside note page")
    public void user_write_notes_inside_note_page() {
        BrowserUtils.waitFor(2);
        actions.moveToElement(notePage.noteArea).click().sendKeys(expectedText).perform();
    }

    @Then("verify that user created the note and its title matches with the first word")
    public void verify_that_user_created_the_note_and_its_title_matches_with_the_first_word() {
        BrowserUtils.waitFor(3);
        String actualText = (notePage.lastNotTitle).getAttribute("title");
        System.out.println("actualText = " + actualText);
        Assert.assertEquals(expectedText, actualText);


    }

    // AC2 -----------------------------------------------------------------------------------------

    @When("user click one note three dot menu link")
    public void user_click_one_note_three_dot_menu_link() {

        actions.moveToElement(notePage.leftNoteMenu).click().perform();

    }

    @When("user click to Add to favorites inside the opened menu")
    public void user_click_to_add_to_favorites_inside_the_opened_menu() {
        actions.moveToElement(notePage.addToFavorites).click().perform();
    }

    @When("user click Files button on the head menu")
    public void user_click_files_button_on_the_head_menu() {
        basePage.filesIcon.click();
    }

    @When("user click to Favorites on the left menu")
    public void user_click_to_favorites_on_the_left_menu() {
        notePage.addToFavorites.click();

    }

    @Then("verify that favorite note inside the favorites")
    public void verify_that_favorite_note_inside_the_favorites() {
        BrowserUtils.waitFor(3);
        String lastNoteTextInTheFavoriteArea = notePage.favoritesLastWebElement.getAttribute("title");
        System.out.println("lastNoteHeadInTheFavoriteArea = " + lastNoteTextInTheFavoriteArea);
        Assert.assertEquals(expectedText, lastNoteTextInTheFavoriteArea);

    }

    // AC3 -----------------------------------------------------------------------------------------

    @When("user click the first favorite note")
    public void user_click_the_first_favorite_note() {
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//a[@class='app-navigation-entry-link'])[4]"))).click().perform();

    }

    @When("user click right three dot menu")
    public void user_click_right_three_dot_menu() {
        actions.moveToElement(notePage.rightNoteMenu).click().perform();
    }

    @When("user click the details button")
    public void user_click_the_details_button() {
        BrowserUtils.waitFor(2);
        actions.moveToElement(notePage.detailsButton).click().perform();
    }

    @Then("user verify the informations showed under the header note")
    public void user_verify_the_informations_showed_under_the_header_note() {
        String expectedText = "1 word, 5 characters";
        String actualDetailsText = notePage.detailsArea.getText();
        System.out.println("actualDetailsText = " + actualDetailsText);
        Assert.assertEquals(expectedText, actualDetailsText);
    }

    // AC4 -----------------------------------------------------------------------------------------

    @When("user enter the new category name inside the input under the categories")
    public void user_enter_the_new_category_name_inside_the_input_under_the_categories() {

        actions.moveToElement(Driver.getDriver().findElement(By.xpath(" //input[@id='category']"))).click().sendKeys(expectedCategory).perform();

    }

    @When("user click the enter arrow")
    public void user_click_the_enter_arrow() {

    }

    @When("user click the categories button on the left menu")
    public void user_click_the_categories_button_on_the_left_menu() {
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//span[@title='Categories']"))).click().perform();


    }

    @When("user verify the new category name displayed on the left menu")
    public void user_verify_the_new_category_name_displayed_on_the_left_menu() {
        BrowserUtils.waitFor(2);
        String actualCreatedCategory = Driver.getDriver().findElement(By.xpath("(//span[@class='app-navigation-entry__title'])[3]")).getAttribute("title");
        System.out.println("actualCreatedCategory = " + actualCreatedCategory);
        Assert.assertEquals(expectedCategory, actualCreatedCategory);

    }

    // AC5 -----------------------------------------------------------------------------------------

    @When("user click th Delete button")
    public void user_click_th_delete_button() {
        actions.moveToElement(notePage.deleteNoteButton).click().perform();

    }
}
