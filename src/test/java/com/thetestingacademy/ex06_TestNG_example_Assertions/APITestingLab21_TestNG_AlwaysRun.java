package com.thetestingacademy.ex06_TestNG_example_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestingLab21_TestNG_AlwaysRun {

    @Test
    public void test_register() {
        Assert.assertTrue(true);

    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }

}
