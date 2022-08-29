package com.cydeo.step_definitions.MeetSky;

import com.cydeo.pages.MeetSky.FolderViewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class FolderView_StepDefinition {
    FolderViewPage folderViewPage = new FolderViewPage();


    @When("Click on the triangle next to {string} button.")
    public void click_on_the_triangle_next_to_button(String string) {
        folderViewPage.triangleNameN.click();
    }

    @When("if triangle is North possitioned")
    public void if_triangle_is_north_possitioned() {
        if (folderViewPage.triangleNameN.isSelected()) {

        }
    }

    @Then("user should see asscending {string} order")
    public void user_should_see_asscending_order(String string) {
        // Assert.assertTrue();

    }

    @Then("if triangle is South possitioned")
    public void if_triangle_is_south_possitioned() {
        if (folderViewPage.triangleNameS.isSelected()) {
            //Assert.assertTrue(folderViewPage.tableRows.getText().);
        }
    }

    @Then("user should see descending {string} order")
    public void user_should_see_descending_order(String string) {

    }


    @When("user clicks on list toggle-view on the right up")
    public void user_clicks_on_list_toggle_view_on_the_right_up() {
        folderViewPage.toggleListView.click();
    }

    @Then("user should see the list view")
    public void user_should_see_the_list_view() {
        Assert.assertTrue(folderViewPage.toggleListView.isDisplayed());
    }

    @Then("user cllicks on picture toggle view")
    public void user_cllicks_on_picture_toggle_view() {

        folderViewPage.togglePicturesView.click();
    }

    @Then("user should see the picture view")
    public void user_should_see_the_picture_view() {
        Assert.assertTrue(folderViewPage.folderView.isDisplayed());
    }


    @When("Click on the “select all” checkbox at the left top corner of the list.")
    public void click_on_the_select_all_checkbox_at_the_left_top_corner_of_the_list() {
        folderViewPage.selectAllCheckBox.click();
    }

    @Then("User should see the total values of all files in the first line .")
    public void user_should_see_the_total_values_of_all_files_in_the_first_line() {
        Assert.assertTrue(folderViewPage.selectAllCheckBox.isDisplayed());

    }


}
