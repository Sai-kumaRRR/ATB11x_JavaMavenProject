package com.thetestingacademy.ex06_TestNG_example_Assertions;

import org.testng.annotations.Test;

public class APITestingLab22_TestNG_invocationCount {

    @Test(invocationCount = 2)
    public void test01() {
        System.out.println("Hi");

    }

    @Test(invocationCount = 3)
    public void test02() {
        System.out.println("Bye");

    }

    @Test()
    public void test03() {
        System.out.println("Bye");

    }
}
