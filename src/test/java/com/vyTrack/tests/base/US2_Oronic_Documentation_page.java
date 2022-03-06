package com.vyTrack.tests.base;

import com.vyTrack.utilities.Driver;
import com.vyTrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US2_Oronic_Documentation_page {

    @Test
    public void Oronic_Documentation_page() throws InterruptedException {
        VytrackUtils.loginAsSalesManager();

        WebElement QuestionMark = Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Thread.sleep(1000);
        QuestionMark.click();
        Thread.sleep(1000);

        for (String eachWind : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(eachWind);
        }

        String currentpage = Driver.getDriver().getTitle(); // prove of newWindow
        System.out.println("currentpage = " + currentpage);

        Boolean isDisplay = Driver.getDriver().findElement(By.tagName("h1")).isDisplayed();
        Assert.assertTrue(isDisplay);
    }
}


