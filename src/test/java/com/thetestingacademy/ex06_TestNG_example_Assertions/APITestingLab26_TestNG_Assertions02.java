package com.thetestingacademy.ex06_TestNG_example_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITestingLab26_TestNG_Assertions02 {

    @Test(enabled = false)
    public void test_hardAssertionExamples(){
        System.out.println("Start of the program");
        Boolean is_Sonu = false;
        Assert.assertEquals("sai", "Sai");
        System.out.println("End of the program");


    }
    // software assertion

    @Test
    public void test_softAssertionExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("sai","Sai");
        System.out.println("End of program");
        softAssert.assertAll();
    }

}
