package com.cydeo.step_definitions.MeetSky;

import com.cydeo.pages.MeetSky.CalendarPage;
import com.cydeo.pages.MeetSky.BasePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class CalendarStepDefs {

    BasePage loginPage = new BasePage();
    CalendarPage calendarPage = new CalendarPage();
//    Actions actions = new Actions(Driver.getDriver());

    @Then("click on the calendar icon on the home page")
    public void click_on_the_calendar_icon_on_the_home_page() {
        calendarPage.calendarIcon.click();
    }

    @Then("click on the menu toggle icon on calendar page")
    public void click_on_the_menu_toggle_icon_on_calendar_page() {
        BrowserUtils.waitFor(5);
        calendarPage.calendarToggleMenu.click();
//        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//button[@class='icon action-item__menutoggle icon-view-module']"))).click().perform();
    }

    @Then("User can click day button on calendar menu")
    public void user_can_click_day_button_on_calendar_menu() {
        BrowserUtils.waitFor(5);
        calendarPage.dayCalendarMenu.click();
    }

    @Then("User can click week button on calendar menu")
    public void user_can_click_week_button_on_calendar_menu() {
        BrowserUtils.waitFor(5);
        calendarPage.weekCalendarMenu.click();
    }

    @Then("User can click month button on calendar menu")
    public void user_can_click_month_button_on_calendar_menu() {
        BrowserUtils.waitFor(5);
        calendarPage.monthCalendarMenu.click();
    }

    @Then("User can create a new event on calendar page")
    public void user_can_create_a_new_event_on_calendar_page() {
        BrowserUtils.waitFor(5);
        calendarPage.createNewEvent.click();
    }

    @Then("User should click save button")
    public void user_should_click_save_button() {
        BrowserUtils.waitFor(5);
        calendarPage.saveButton.click();
    }

    @Then("user need to choose untitled event on calendar")
    public void user_need_to_choose_untitled_event_on_calendar() {
        BrowserUtils.waitFor(5);
        calendarPage.untitledEventMessage.click();
    }

    @Then("user should click dots on event page")
    public void user_should_click_dots_on_event_page() {
        BrowserUtils.waitFor(5);
        calendarPage.dotsButton.click();
    }

    @Then("user can delete an event on calendar page")
    public void user_can_delete_an_event_on_calendar_page() {
        BrowserUtils.waitFor(5);
        calendarPage.deleteEventButton.click();
    }


}
