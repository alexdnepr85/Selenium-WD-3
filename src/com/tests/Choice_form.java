package com.tests;

import com.company.BrawzerFactory;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Alex on 17.09.2015.
 */
public class Choice_form extends BrawzerFactory {

    public By loginBtn = By.xpath("//a [@href='https://www.pdffiller.com/en/login.htm']");
    public By loginSubmit = By.id("form-login-submit");
    public By BlockChoice = By.xpath("//*[@class='sngl-btn sngl-orange icon_fill sngl_action_fill']");
    public By NoneChoice = By.xpath("//*[@class='sngl-btn sngl-orange icon_fill sngl_action_fill -disabled']");

    @Test
    public void ChekUserLogedIn() throws InterruptedException {
        driver.get("http://www.pdffiller.com");

        driver.findElement(loginBtn).click(); //ищем кнопку Login и нажимает на неё

        driver.findElement(By.id("form-login-email")).clear();
        driver.findElement(By.id("form-login-email")).sendKeys("alexdnepr+500@pdffiller.com");

        driver.findElement(By.id("form-login-password")).clear();
        driver.findElement(By.id("form-login-password")).sendKeys("210513");
        driver.findElement(loginSubmit).click();
        Thread.sleep(5000);

        driver.findElement(BlockChoice).click();
        //driver.findElement(NoneChoice).click();
        Thread.sleep(5000);
    }
}