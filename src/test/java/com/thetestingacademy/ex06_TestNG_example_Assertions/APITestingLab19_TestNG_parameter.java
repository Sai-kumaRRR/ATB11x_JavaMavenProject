package com.thetestingacademy.ex06_TestNG_example_Assertions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITestingLab19_TestNG_parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value) {
        System.out.println("Hi i am demo");
        System.out.println("you are running this param");


        if (value.equalsIgnoreCase("firefox")) {

            System.out.println("start the firefox");

        }
        if (value.equalsIgnoreCase("chrome")) {
            System.out.println("start the chrome!");
        }

    }

}
