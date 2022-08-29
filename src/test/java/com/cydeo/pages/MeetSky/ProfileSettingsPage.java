package com.cydeo.pages.MeetSky;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {
    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//img[@width='32']")
    public WebElement AvatarForProfileSettings;

    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement Settings;

    @FindBy(xpath = "//*[@value='zak']")
     public WebElement FullNameInput;

    @FindBy(css = "#phoneform .icon-password span")
    public WebElement DropdownByPhoneNumber;

    @FindBy(id = "localeexample-time")
    public WebElement localTime;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "phone")
    public WebElement phoneInput;

    @FindBy(xpath = "//div[@tabindex='0'][.//strong[text()='Public']]//span[contains(@class, 'icon-federation-menu')]//span")
    public WebElement privateMode;

    @FindBy(xpath ="//*[@id='phoneform']/h3/div/div/ul/li[1]/a/p/strong")
    public WebElement privateModeSelected;


   





    
    
    
    
    
    
   









    
}
