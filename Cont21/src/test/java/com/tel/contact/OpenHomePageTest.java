package com.tel.contact;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenHomePageTest extends TestBase{

    @Test
    public void homePageTest() {
        System.out.println("Site opened");
        driver.findElement(By.cssSelector("div:nth-child(2) > div > div"));
        System.out.println("HomeComponent:" + isElementPresent(By.cssSelector("div:nth-child(2) > div > div")));
    }

}
