package com.thetestingacademy.ex06_TestNG_example_Assertions;

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
