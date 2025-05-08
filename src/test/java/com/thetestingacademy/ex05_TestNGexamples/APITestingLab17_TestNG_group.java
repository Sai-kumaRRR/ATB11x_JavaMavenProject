package com.thetestingacademy.ex05_TestNGexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestingLab17_TestNG_group {


    // sanity - 1
    // reg -> 3
    // p1 -> 2
    @Test(groups = {"sanity", "reg"}, priority = 1)
    public void test_sanityRun() {
        System.out.println("sanity");
        System.out.println("QA");
        Assert.assertTrue(true);

    }

    @Test(groups = {"reg"}, priority = 2)
    public void test_regRun() {
        System.out.println("Reg");
        System.out.println("----");
        Assert.assertTrue(false);

    }

    @Test(groups = {"p1", "reg"}, priority = 3)
    public void test_smokeRun() {
        System.out.println("smoke");
        Assert.assertTrue(false);
    }
}
