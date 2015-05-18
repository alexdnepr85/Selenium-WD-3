package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.company.UZ_PageObject.*;

/**
 * Created by Admin on 18.05.15.
 */

@RunWith(JUnit4.class)

public class UZ_test {

    @Before

    public void initialize(){

        open();

    }

    @After

    public void cleanUp () {

        clean();
    }

    @Test

    public void Test1(){

        openUrl("http://booking.uz.gov.ua/en/");
        setACField(fromField, "Kyiv");
        setACField(toField, "Ivano-Frankivsk");
        setDepDate("June 2015", "20");
        click(searchButton);
        Assert.assertTrue(verifySearchResult("043K"));
        Assert.assertTrue(verifySearchResult("143K"));



    }





}