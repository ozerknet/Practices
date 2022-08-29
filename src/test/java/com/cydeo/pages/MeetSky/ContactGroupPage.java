package com.cydeo.pages.MeetSky;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactGroupPage {
    public ContactGroupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Scenario: User can create a new group under Contacts Module
    @FindBy(xpath = "//a[@href='/index.php/apps/contacts/'][1]")
    public WebElement contactsBtn;

    @FindBy(css = "button.icon.vue-button.action-item__menutoggle.icon-add")
    public WebElement plusBtn;

    @FindBy(css = "span.action-text__text")
    public WebElement newGroup;

    @FindBy(css = "input.action-input__input.focusable")
    public WebElement newGroupInputBox;

    @FindBy(xpath = "//span[@class = 'material-design-icon arrow-right-icon']")
    public WebElement arrow;

    @FindBy(xpath = "//h2[contains(text(),'no contacts')]")
    public WebElement noContacts;


    // Scenario: User can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
    @FindBy(xpath = "(//span[@class = 'material-design-icon dots-horizontal-icon'])[2]")
    public WebElement threeDots;

    @FindBy(xpath = "//li[@class = \"action active\"]")
    public WebElement addContactsBtn;

    @FindBy(xpath = "//div[@class = 'entity-picker__search']//input[@placeholder = 'Search Contacts…']")
    public WebElement searchContactsPlaceholder;

    @FindBy(xpath = "//div[@role = 'listitem']//span[@class = 'user-bubble__title']")
    public WebElement chooseContactName;

    @FindBy(css = "button.navigation__button-right.primary")
    public WebElement addToGroup;

    @FindBy(xpath = "//span[@ title = 'Bridgerton']")
    public WebElement groupName;

    @FindBy (xpath = "//div[@class = 'app-content-list']")
    public WebElement contactList;


    // Scenario: User can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
    @FindBy (xpath = "(//div[@class = 'multiselect__tags'])[6]")    //div[@class = 'multiselect property__value multiselect--above multiselect--multiple']"
    public WebElement groupPlaceholder;

    @FindBy (xpath = "//li[@class = 'multiselect__element']//span[@class = 'multiselect__option multiselect__option--highlight']")
    public WebElement groupDropdown;
    /* @FindBy (xpath = "//li[@class = 'multiselect__element']//span[@class = 'multiselect__option multiselect__option--highlight']")
    private List<WebElement> groupDropdown;

    public List<WebElement> getGroupDropdown() {
        return groupDropdown;
    }*/


    // Scenario:  User can add a new property as 'Birthday' to the contact’s info page from the 'Add new property' dropdown menu
    @FindBy (id = "NTZjMjNiNjktNmQ4Ny00MzJmLTk0MjctM2RjMWRlYTgxZjI2fmNvbnRhY3")
    public WebElement getChooseContactName;

    @FindBy (xpath = "//input[@placeholder = 'Choose property type']")
    public WebElement newPropertyPlaceholder;

    @FindBy (xpath = "//div[@title = 'Birthday']")
    public WebElement birthdayProperty;

    @FindBy (xpath = "//div[@class = 'property__value mx-datepicker']")
    public WebElement datePicker;
}
