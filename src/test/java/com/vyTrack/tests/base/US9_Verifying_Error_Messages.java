package com.vyTrack.tests.base;

import com.vyTrack.utilities.BrowserUtils;
import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US9_Verifying_Error_Messages extends TestBase{


        @Test
        public void err_msg_sales_manager(){
            //1.Users go to homepage
            VytrackUtils.loginAsSalesManager();

            //2.User click the "Calendar Events" under the Activities
            Actions actions=new Actions(Driver.getDriver());
            actions.moveToElement(Driver.getDriver().findElement(By.xpath("//li[5]//span[@class='title title-level-1']")))
                    .pause(1)
                    .perform();
            Driver.getDriver().findElement(By.xpath("//li[@data-route='oro_calendar_event_index']")).click();


            //3.User click on "Create Calendar Event" button
            WebElement createCalendarEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
            createCalendarEvent.click();

            //4.User check the Repeat checkbox
            WebElement repeatCheckbox = Driver.getDriver().findElement(By.xpath("//input[@data-name='recurrence-repeat']"));
            BrowserUtils.sleep(2);
            repeatCheckbox.click();

            //5.User enter an INVALID integer(x<1 || x>99)
            // 6.Verify user get 2 error messages.
            WebElement inputBox = Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
            inputBox.clear();
            inputBox.sendKeys("0");
            WebElement ErrMessage1 = Driver.getDriver().findElement(By.xpath("(//span[.='The value have not to be less than 1.'])[3]"));
            Assert.assertTrue(ErrMessage1.isDisplayed());


            inputBox.clear();
            inputBox.sendKeys("120");
            WebElement ErrMessage2 = Driver.getDriver().findElement(By.xpath("(//span[.='The value have not to be more than 99.'])[3]"));

            Assert.assertTrue(ErrMessage2.isDisplayed());
        }
    }


