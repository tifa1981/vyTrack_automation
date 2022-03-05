package com.vyTrack.tests.base;

import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class TestBase {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }
   @AfterMethod
    public static void tearDown(){
        Driver.closeDriver();

   }


    }

