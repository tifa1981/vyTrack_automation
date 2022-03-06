package com.vyTrack.tests.base;

import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US1_Test_Main_Modules extends TestBase {

    // create a data provider method with 3 sets of given data (username and list of modules), return new Object 2-D arrays
    // verify the expected title with actual title
    @DataProvider(name = "data_provider")
    public Object [][] dataProviderMethod(){
        return new Object[][]{
                {"driver_username", new ArrayList<>(Arrays.asList(
                        "Fleet", "Customers", "Activities", "System"))},
                {"sales_manager_username", new ArrayList<>(Arrays.asList(
                        "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"))},
                {"store_manager_username", new ArrayList<>(Arrays.asList(
                        "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"))}

        };

    }
    @Test(dataProvider ="data_provider")
    public void Verifying_modules(String username,ArrayList<String> expectedmoduleTexts) throws InterruptedException {
        VytrackUtils.login(ConfigurationReader.getProperty(username));

        Thread.sleep(2000);
        List<WebElement> moduleElements = Driver.getDriver().findElements(By.cssSelector("li[class*='dropdown dropdown-level-1']"));
        List<String> actualmoduleTexts = new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualmoduleTexts.add(moduleElementText);
        }
        System.out.println(actualmoduleTexts);
        Assert.assertEquals(actualmoduleTexts, expectedmoduleTexts);
    }
}















