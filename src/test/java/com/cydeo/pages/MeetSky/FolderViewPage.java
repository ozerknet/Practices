package com.cydeo.pages.MeetSky;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FolderViewPage {

    public FolderViewPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='sort-indicator icon-triangle-s']")
    public WebElement triangleNameS;

    @FindBy(xpath = "//*[@class='sort-indicator icon-triangle-n']")
    public WebElement triangleNameN;

    @FindBy(xpath = "//table[@class=\"list-container has-controls\"]/tbody//tr")
    public WebElement tableRows;

    @FindBy(xpath="//span[.='Size']")
     public WebElement sizeButton;


    @FindBy(xpath="//span[.='Modified']")
    public WebElement modifiedButton;








    @FindBy(xpath="//*[@class=\"list-container has-controls\"]")
    public WebElement toggleListView;


    @FindBy(xpath="//*[@class=\"list-container has-controls view-grid\"]")
    public WebElement togglePicturesView;



    @FindBy(xpath="//label[@for=\"select_all_files\"]")
    public WebElement selectAllCheckBox;


    // Here I have find the first folder from the firs row
    @FindBy(xpath= "//table[@class=\"list-container has-controls view-grid\"]/tbody//tr[1]")
    public WebElement folderView;



}




