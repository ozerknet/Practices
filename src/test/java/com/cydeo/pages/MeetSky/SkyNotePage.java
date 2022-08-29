package com.cydeo.pages.MeetSky;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkyNotePage {
    public SkyNotePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(@aria-label,'Notes')])[1]") // NoteButton
    public WebElement noteButton;

    @FindBy(xpath = "//button[@id='notes_new_note']") //NewNoteButton
    public WebElement newNoteButton;

    @FindBy(xpath = "(//pre)[2]") //NoteArea
    public WebElement noteArea;

    @FindBy(xpath ="(//span[@class='app-navigation-entry__title'])[4]") //NoteTitle
    public WebElement lastNotTitle;


    //------------------------------------------------

    @FindBy(xpath = "(//div[@class='app-navigation-entry__utils'])[3]")// leftNoteMenu
    public WebElement leftNoteMenu;

    @FindBy(xpath = "(//span[@class='action-button__text'])[3]") // addToFavorites
    public WebElement addToFavorites;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]") // favoritesLastWebElement
    public WebElement favoritesLastWebElement;


    //-------------------------------------------------
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]") // headMainMenuFilesButton
    public WebElement headMainMenuFilesButton;

//    @FindBy(xpath = "")// favoritesButton

    //-------------------------------------------------

    @FindBy(xpath = "(//div[@class='trigger'])[5]") // rightNoteMenu
    public WebElement rightNoteMenu;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[2]") // detailsButton
    public WebElement detailsButton;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']") // detailsArea
    public WebElement detailsArea;

    //-------------------------------------------------

    @FindBy(xpath = "//input[@id='category']") // categoryNameInput
    public WebElement categoryNameInput;

    @FindBy(xpath = "(//input[@type='submit'])[3]") // enterButton
    public WebElement enterButton;

    @FindBy(xpath = "//span[@title='Categories']") // categoriesButton
    public WebElement categoriesButton;

//    @FindBy(xpath = "") // lastCategoryWebElement

    //-------------------------------------------------

    @FindBy (xpath = "(//span[@class='action-button__text'])[3]") // deleteNoteButton
    public WebElement deleteNoteButton;

    //------------------------------------------------




}
