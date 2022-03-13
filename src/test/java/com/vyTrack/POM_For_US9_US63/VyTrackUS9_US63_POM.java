package com.vyTrack.POM_For_US9_US63;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackUS9_US63_POM {

    //# Initialize the Driver instance and object of the class
    public VyTrackUS9_US63_POM() {
         /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#2- use @FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@placeholder='Username or Email']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement inputPassWord;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement signInButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement ActivitiesButton;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventsUnderActivitiesTab;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvents;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatButton;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement inputBox;

    // @FindBy(xpath = "(//span[@class='validation-failed'])[2]")
    @FindBy(xpath = "//span[@class='validation-failed']")
    public WebElement CheckErrorMessage;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement ActivitiesButtonAS_Driver;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventsUnderActivitiesTab_AsDriver;

}


