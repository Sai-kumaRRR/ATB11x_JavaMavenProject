package com.thetestingacademy.ex05_TestNGexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab15_BeforeTestcase {

    // PUT Request -
    // 1.) get token
    // 2.) getbookingid
    //3.) test_PUT( Which will use the above two method
    // 4.) closeAll thing
    @BeforeTest
    public void getBookingID(){
        System.out.println("BEFORE BOOKING ID");

    }
    @BeforeTest
    public void getToken(){
        System.out.println("BEFORE GET TOKEN");

    }
    @Test
    public void test_PUT(){
        //token and bookingid
        System.out.println("GET PUT REQUEST ");

    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("close");
    }

}
