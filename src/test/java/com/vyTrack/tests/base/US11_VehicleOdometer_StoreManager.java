package com.vyTrack.tests.base;

import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US11_VehicleOdometer_StoreManager extends TestBase {
    @DataProvider(name = "storeManager_data_provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"store_manager_username"},
                {"store_manager_username2"},
                {"store_manager_username3"},
                {"store_manager_username4"},

        };
    }

    ;

    @Test(dataProvider = "storeManager_data_provider")
    public void Locating_Vehicle_Odometer(String username) throws InterruptedException {
        VytrackUtils.login(ConfigurationReader.getProperty(username));
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.cssSelector("button[data-dismiss='alert']")).click();//closing the alert

        WebElement fleetMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
         System.out.println("fleetMenu.getText() = " + fleetMenu.getText());
        fleetMenu.click();
        BrowserUtils.sleep(2);

        WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
        System.out.println("vehicleOdometer.getText() = " + vehicleOdometer.getText());
        vehicleOdometer.click();
        BrowserUtils.sleep(2);

        WebElement errorMessage = Driver.getDriver().findElement(By.cssSelector("div[class = 'message']"));
        System.out.println("errorMessage.getText() = " + errorMessage.getText());
    }
}