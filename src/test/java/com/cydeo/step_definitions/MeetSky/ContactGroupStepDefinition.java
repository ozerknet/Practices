package com.cydeo.step_definitions.MeetSky;

import com.cydeo.pages.MeetSky.ContactGroupPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactGroupStepDefinition {

    ContactGroupPage contactGroupPage = new ContactGroupPage();

    // Scenario: User can create a new group under Contacts Module
    @When("Click on the Contacts icon top up to the page")
    public void click_on_the_contacts_icon_top_up_to_the_page() {
        contactGroupPage.contactsBtn.click();
    }
    @When("Verify that user can see the contact page")
    public void verify_that_user_can_see_the_contact_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Contacts - QA - Meetsky";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("Click on the plus button on the right of the Groups")
    public void click_on_the_plus_button_on_the_right_of_the_groups() {
        contactGroupPage.plusBtn.click();
    }
    @Then("Verify that user can see the small window with Create a new group text")
    public void verify_that_user_can_see_the_small_window_with_create_a_new_group_text() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(contactGroupPage.newGroup.isDisplayed());
    }
    @Then("Enter a new group name")
    public void enter_a_new_group_name() {
        contactGroupPage.newGroupInputBox.sendKeys("Poldark");
    }
    @Then("Click the arrow on the right side of the input box")
    public void click_the_arrow_on_the_right_side_of_the_input_box() {
        contactGroupPage.arrow.click();
    }
    @Then("Verify that user can see There are no contacts in this group message in the new group page")
    public void verify_that_user_can_see_there_are_no_contacts_in_this_group_message_in_the_new_group_page() {
        contactGroupPage.noContacts.isDisplayed();
    }


    // Scenario: User can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
    @When("Click on the three dots button next to the group name")
    public void click_on_the_three_dots_button_next_to_the_group_name() {
        contactGroupPage.threeDots.click();
    }
    @And("Click Add contacts button")
    public void click_add_contacts_button(){
        contactGroupPage.addContactsBtn.click();
    }
    @Then("Verify that user can see the contacts list on the new small window")
    public void verify_that_user_can_see_the_contacts_list_on_the_new_small_window() {
        String searchContacts = contactGroupPage.searchContactsPlaceholder.getAttribute("placeholder");
        System.out.println("searchContacts = " + searchContacts);
        Assert.assertTrue(searchContacts.equalsIgnoreCase("Search Contacts…"));
      //  contactGroupPage.searchContactsPlaceholder.isDisplayed();
    }
    @Then("Click the any contact name from the list of contact")
    public void click_the_any_contact_name_from_the_list_of_contact() {
        contactGroupPage.chooseContactName.click();
    }
    @Then("Click the Add to group name button")
    public void click_the_add_to_group_name_button() {
        contactGroupPage.addToGroup.click();
    }
    @Then("Click the Group Name which one you add a new contact name")
    public void click_the_group_name_which_one_you_add_a_new_contact_name() {
        BrowserUtils.sleep(5);
        contactGroupPage.groupName.click();
    }
    @Then("Verify that user can see the all contacts of group as a list inside middle column")
    public void verify_that_user_can_see_the_all_contacts_of_group_as_a_list_inside_middle_column() {
        Assert.assertTrue(contactGroupPage.contactList.isDisplayed());
    }


    // Scenario: User can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
    @When("Click the Groups box in the contact’s own info menu")
    public void click_the_groups_box_in_the_contact_s_own_info_menu() {
        BrowserUtils.sleep(2);
        contactGroupPage.groupPlaceholder.click();
    }
    @Then("Verify that user can see all the available groups name through the groups dropdown menu existing")
    public void verify_that_user_can_see_all_the_available_groups_name_through_the_groups_dropdown_menu_existing() {
        contactGroupPage.groupDropdown.isDisplayed();
    /*    BrowserUtils.waitFor(3);
        List<WebElement> groups = contactGroupPage.getGroupDropdown();
            for(WebElement group : groups){
                System.out.println(group.getText());

            }*/
    }



    // Scenario:  User can add a new property as 'Birthday' to the contact’s info page from the 'Add new property' dropdown menu
    @When("Click the any contact from the list of contact")
    public void click_the_any_contact_from_the_list_of_contact() {
        contactGroupPage.getChooseContactName.click();
    }
    @When("Click the dropdown menu under the Add new property")
    public void click_the_dropdown_menu_under_the_add_new_property() {
        contactGroupPage.newPropertyPlaceholder.click();
    }
    @Then("Verify that user can see Birthday property inside the different properties")
    public void verify_that_user_can_see_birthday_property_inside_the_different_properties() {
        String dropdownProperties = contactGroupPage.birthdayProperty.getAttribute("title");
        System.out.println("dropdownProperties = " + dropdownProperties);
        Assert.assertTrue(dropdownProperties.equalsIgnoreCase("Birthday"));
    }
    @Then("Click the Birthday property")
    public void click_the_birthday_property() {
        contactGroupPage.birthdayProperty.click();
    }
    @Then("Verify that user can see Birthday property as a dropdown menu in the contact info page")
    public void verify_that_user_can_see_birthday_property_as_a_dropdown_menu_in_the_contact_info_page() {
        Assert.assertTrue(contactGroupPage.datePicker.isDisplayed());

    }
}
