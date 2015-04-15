package com.company;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class NesTests {
    public WebDriver dr;

        @Test
        public void test1() {
            Assert.fail();
        }

        @Test
        public void test2() {
            int a = 10;
            int b = 6;
            int expResult = 15;
            Assert.assertEquals("expResult didn`t match.", expResult, a + b);
            Assert.assertTrue(expResult == (a + b));
            dr.quit();
        }
    @After
    public void clean() {

    }


}