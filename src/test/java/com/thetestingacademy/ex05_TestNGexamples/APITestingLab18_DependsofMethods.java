package com.thetestingacademy.ex05_TestNGexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestingLab18_DependsofMethods {


    @Test
    public void serverstartedok() {
        System.out.println("I Will run first");
        Assert.assertTrue(true);

    }

    @Test(dependsOnMethods = "serverStartOk")
    public void test1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "severStarOk")
    public void test2() {
        System.out.println("method2");
        Assert.assertTrue(true);


    }


}
