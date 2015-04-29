package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Alex on 29.04.2015.
 */

public class GooglePage {
    public static WebDriver driver;
    public final static int WAIT_COUNTER;


    ("//textarea[@id = 'source']"));

    GooglePage.driver =  driver;
    driver.get(https:// translate.google.com/)


    WebElement inputField = driver.findElement(By.xpath("//textarea[@id = 'source']"));

    }
public static boolean isEmpty (WebElement element){
    if (element.getText().equals("")) return element

    public static boolean isEmpty (WebElement element){
        if (element.getText().equals("")) return element
    }

    public static boolean veryPresent (String xpath) thows Exception {

        int counter = 0;
        while(driver.findElements(By.xpath(xpath)).size() ==0)
            Thread.sleep(100);
            counter +=100;
                if (counter == 2000) {
                    break;
                    return false;

                }
        return true;
    }
}


        )