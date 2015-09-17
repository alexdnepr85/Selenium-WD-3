package com.tests;

import com.company.BrawzerFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Alex on 17.09.2015.
 */
public class Critical_test_suite extends BrawzerFactory{

    public By loginBtn = By.xpath("//a [@href='https://www.pdffiller.com/en/login.htm']");


@Test
public void ChekUserLogedIn() throws InterruptedException {
        driver.get("http://www.pdffiller.com");

        driver.findElement(loginBtn).click(); //ищем кнопку Login и нажимает на неё

        driver.findElement(By.id("form-login-email")).clear();
        driver.findElement(By.id("form-login-email")).sendKeys("alexdnepr@pdffiller.com");

    driver.findElement(By.id("form-login-password")).clear();
    driver.findElement(By.id("form-login-password")).sendKeys("210513");

    driver.findElement(By.id("form-login-submit")).click();

    Thread.sleep(3000);


    //html//button
}

}