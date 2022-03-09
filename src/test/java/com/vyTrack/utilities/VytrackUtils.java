package com.vyTrack.utilities;

import org.openqa.selenium.By;

public class VytrackUtils {

    public static void login(String username){
        String password = "UserUser123";
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }
    public static void login(String username, String password){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);
        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }


    public static void loginAsDriver(){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("driver_password"));

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }
    public static void loginAsStoreManager(){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }
    public static void loginAsSalesManager(){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        //pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }
}
