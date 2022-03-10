package com.vyTrack.tests.base;

import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_4_Vehicle_Contracts_Page {


    @Test
    public void Vehicle_Contracts_Page_Sale_Manager() throws InterruptedException {
        VytrackUtils.loginAsSalesManager();

        //  fleetPage.click();
        Actions act = new Actions(Driver.getDriver());
        WebElement fleetPage = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
       WebElement webEle = Driver.getDriver().findElement(By.xpath("(//a[@href='/entity/Extend_Entity_VehicleContract'])[3]//span"));
        Thread.sleep(2000);
    act.moveToElement(fleetPage).moveToElement(webEle).click().perform();

        //     System.out.println("webEle.getText() = " + webEle.getText());
        Thread.sleep(2000);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String currentTitle = Driver.getDriver().getTitle();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Assert.assertEquals(currentTitle,expectedTitle);

       Driver.closeDriver();
    }


    @Test
    public void Vehicle_Contracts_Page_Store_Manager() throws InterruptedException {
        VytrackUtils.loginAsStoreManager();

        //  fleetPage.click();
        Actions act = new Actions(Driver.getDriver());
        WebElement fleetPage = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        WebElement webEle = Driver.getDriver().findElement(By.xpath("(//a[@href='/entity/Extend_Entity_VehicleContract'])[3]//span"));
        Thread.sleep(2000);
        Thread.sleep(2000);
        act.moveToElement(fleetPage).moveToElement(webEle).click().perform();

        System.out.println("webEle.getText() = " + webEle.getText());
        Thread.sleep(2000);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String currentTitle = Driver.getDriver().getTitle();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

         Assert.assertEquals(currentTitle,expectedTitle);

        Driver.closeDriver();
    }

    @Test
    public void Vehicle_Contracts_Page_Driver() throws InterruptedException {
        VytrackUtils.loginAsDriver();

        //  fleetPage.click();
        Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']")).click();
        Thread.sleep(2000);
//
        WebElement webDriver = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-2']"));
        Thread.sleep(2000);
        webDriver.click();

//        Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));

    }


}

