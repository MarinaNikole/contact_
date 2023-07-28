package com.tel.contact;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
// preconditions: user schould be logged out
    @BeforeMethod
    public void ensurePreconditions() {
        // login not present
        if (!isElementPresent(By.xpath("//a[contains(.,'LOGIN')]"))) {
            // click on logout button
            driver.findElement(By.xpath("//button[contains(.,'Sign Out')]")).click();
        }
    }

    @Test
    public void registrationPositivTest() {
        driver.findElement(By.xpath("//a[contains(.,'LOGIN')]")).click();
        Assert.assertTrue( isElementPresent(By.cssSelector(".login_login__3EHKB")));
        driver.findElement(By.cssSelector("[placeholder='Email']")).click();
        driver.findElement(By.cssSelector("[placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("krot@gm.com");
        driver.findElement(By.cssSelector(" [placeholder='Password']")).click();
        driver.findElement(By.cssSelector(" [placeholder='Password']")).clear();
        driver.findElement(By.cssSelector(" [placeholder='Password']")).sendKeys("Kroot54321$");

        driver.findElement(By.xpath("//button[contains(.,' Registration')]")).click();
        //Assert.assertTrue(isElementPresent(By.xpath("//button[contains(.,'Sign Out')]")));


//button[contains(.,' Registration')]
   //     [placeholder='Email']
    //    [placeholder='Password']
    }
    //click on login
    //fill registration form
    // click on Registration button
    // check Logout button displayed

}
