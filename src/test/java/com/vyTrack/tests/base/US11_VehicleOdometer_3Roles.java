package com.vyTrack.tests.base;

import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US11_VehicleOdometer_3Roles extends TestBase{

    @DataProvider(name = "driver_data_provider")
    public Object [][] dataProviderMethod(){
        return new Object[][]{
                {"driver_username"},
                {"driver_username2"},
                {"driver_username3"},
                {"driver_username4"}
        };
    };
    @Test(dataProvider ="driver_data_provider")
    public void Locating_Vehicle_Odometer(String username) throws InterruptedException {
        VytrackUtils.login(ConfigurationReader.getProperty(username));
        BrowserUtils.sleep(2);

        WebElement fleetMenu= Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
       // System.out.println("fleetMenu.getText() = " + fleetMenu.getText());
        fleetMenu.click();
        BrowserUtils.sleep(2);

        WebElement vehicleOdometer= Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[2]"));
       // System.out.println("vehicleOdometer.getText() = " + vehicleOdometer.getText());
        vehicleOdometer.click();
        BrowserUtils.sleep(2);

        WebElement number1= Driver.getDriver().findElement(By.xpath("//input[@value='1']"));
        Assert.assertTrue(number1.isDisplayed());

        ////button[@class='btn dropdown-toggle ']

        WebElement number25= Driver.getDriver().findElement(By.xpath("//button[@class='btn dropdown-toggle ']"));
        System.out.println("number25.getText() = " + number25.getText());
        Assert.assertTrue(number25.isDisplayed());







    }
}


