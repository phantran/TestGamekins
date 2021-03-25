package org.example;

import org.example.Feature;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGExample {

    @BeforeMethod
    public void beforeMethod() {
    }

    @Test
    public void LoginTest()
    {
        Feature a = new Feature(5, 13);
        a.doNothing();
        a.foo(3);
        Assert.assertEquals(1, 1);
    }

    @Test
    public void LogoutTest()
    {
        Assert.assertEquals(6, 6);

    }

    @AfterMethod
    public void afterMethod() {
    }
}