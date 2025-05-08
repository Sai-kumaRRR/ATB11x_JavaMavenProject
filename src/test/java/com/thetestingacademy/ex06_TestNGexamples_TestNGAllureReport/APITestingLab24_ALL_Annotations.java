package com.thetestingacademy.ex06_TestNGexamples_TestNGAllureReport;

import org.testng.annotations.*;

public class APITestingLab24_ALL_Annotations {

    @BeforeSuite
    void demo1() {
        System.out.println("Read the from the SQL");

    }

    @BeforeTest
    void demo2() {
        System.out.println("Data in matrix, TC Before");

    }

    @BeforeClass
    void demo3() {
        System.out.println("BeforeClass");

    }

    @BeforeMethod
    void demo4() {
        System.out.println("BeforeMethod");

    }

    @Test
    void demo5() {
        System.out.println("Test");

    }


}
