package com.tests;

import com.company.BrawzerFactory;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Alex on 17.09.2015.
 */
public class Critical_test_suite extends BrawzerFactory{

    public By loginBtn = By.xpath("//a [@href='https://www.pdffiller.com/en/login.htm']");
    public By loginSubmit = By.id("form-login-submit");

@Test
public void ChekUserLogedIn() throws InterruptedException {
        driver.get("http://www.pdffiller.com");

        driver.findElement(loginBtn).click(); //ищем кнопку Login и нажимает на неё

        driver.findElement(By.id("form-login-email")).clear();
        driver.findElement(By.id("form-login-email")).sendKeys("alexdnepr@pdffiller.com");

    driver.findElement(By.id("form-login-password")).clear();
    driver.findElement(By.id("form-login-password")).sendKeys("210513");
    driver.findElement(loginSubmit).click();

    driver.findElement(By.id("ftd_my_docs")).click();
    driver.findElement(By.xpath("//*[@id='forms_table']//tr[1]")).click();

    Thread.sleep(2000);
            driver.findElement(By.id("btn_action_fill")).click();


            //*[@href='/en/?mode=view']
            //a[contains(@class,'h-nav__link')][1]


            //driver.findElement(By.id("form-login-submit")).click();

    //Thread.sleep(5000);
    Assert.assertTrue(driver.findElements(By.id("flash-content")).size() > 0);


    //html//button
}

}