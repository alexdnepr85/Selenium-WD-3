package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Alex on 30.03.2015.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUTS/chromedriver_win32/chromedriver.exe");

        WebDriver h = new ChromeDriver();

        h.manage().window().maximize();

        h.get("https://denise.pdffiller.com");

        Thread.sleep(5000);



        String s;
        s = "Login";
        int i =10;
        i = s.length();
        s.contains("Login");
        System.out.println(i);

    }

}
