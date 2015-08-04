package com.company;

import org.testng.annotations.Test;

/**
 * Created by Alex on 21.07.2015.
 */
public class Lesson_string {


    @Test
    public void string() {
        String expectedUrl = "http://www.pdffiller.com/en/support";
        String actualUrl = "http://dev2.pdffiller.com/en/support";
        System.out.println(expectedUrl.length());
        String newUrl=expectedUrl.replaceAll("\\.", ":");// замена точек;
        System.out.println(newUrl);
        String newUrl2= newUrl.substring(11,20); // вырезаем кусок из URL
        System.out.println(newUrl2);
        int url2 = actualUrl.indexOf(".");
        System.out.println(actualUrl);
        String url = expectedUrl.substring(url2); //вырезаем кусок строки с символа который нашли в indexOf
        System.out.println(url2);
    }
}
