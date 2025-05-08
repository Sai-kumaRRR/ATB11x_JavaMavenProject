package com.thetestingacademy.ex06_TestNGexamples_TestNGAllureReport;

import org.testng.annotations.*;

public class APITestingLab23_ALL_Annotations {

    @BeforeSuite
    void demo1() {


        System.out.println("BeforeSuite");
    }

    @BeforeTest
    void demo2() {


        System.out.println("BeforeTest");
    }

    @BeforeClass
    void demo3() {


        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4() {
        System.out.println("BeforeMethod");

    }

    @AfterClass
    void demo5() {
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo6() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    void demo7() {
        System.out.println("AfterSuite");
    }


}


