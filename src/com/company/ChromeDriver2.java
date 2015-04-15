package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Alex on 06.04.2015.
 */
public class ChromeDriver2 {

    public static String generatePassword (WebDriver driver, String master, String site) {
        WebElement masterField = driver.findElement(By.name("master"));
        masterField.clear();
        masterField.sendKeys(master);
        driver.findElement(By.name("site")).sendKeys(site, Keys.ENTER);
        WebElement passwordField = driver.findElement(By.name("password"));
        String password = passwordField.getAttribute("value");
        return password;

    }



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUTS/chromedriver_win32/chromedriver.exe");
        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://angel.net/~nic/passwd.sha1.1a.html");
         //   Easy.compare(h, "" ,"alexdnepr.85@gmail.com"), "MyPassword123";
        h.findElement(By.name("master")).sendKeys("12345678");
        // h.findElement(By.name("asda")).getAttribute("value");
        h.findElement(By.name("site")).sendKeys("alexdnepr.85@gmail.com");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String password = h.findElement(By.name("password")).getAttribute("value");
        System.out.println("password 1:" + generatePassword(h, "MyPassword123","alexdnepr.85@gmail.com"));
        System.out.println("password 2:" + generatePassword(h, "MyPassword123","alexdnepr.85@gmail.com"));
        System.out.println("password 3:" + generatePassword(h, "MyPassword123","alexdnepr.85@gmail.com"));

    }
}

