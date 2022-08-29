package com.cydeo.pages.MeetSky;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CalendarPage {

    public CalendarPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/index.php/apps/calendar/']")
    //@FindBy(xpath = "//span[.='Calendar']")
    public WebElement calendarIcon;

    @FindBy(xpath = "//span[@class='material-design-icon view-list-icon']")
    public WebElement calendarToggleMenu;

    @FindBy(xpath = "//span[.='Day']")
    public WebElement dayCalendarMenu;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekCalendarMenu;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthCalendarMenu;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement createNewEvent;

    @FindBy(xpath= "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//td[@class='fc-list-event-title']")
    public WebElement untitledEventMessage;

    @FindBy(xpath = "//div[starts-with(@id, 'popover')]//span[@class='material-design-icon dots-horizontal-icon']")
    public WebElement dotsButton;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteEventButton;

    ////button[text()[normalize-space()='More']]

}
