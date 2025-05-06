package com.thetestingacademy.ex01_RA_concept02;

public class APITesting_Lab04_BuilderPattern {


    public APITesting_Lab04_BuilderPattern step1() {
        System.out.println("step1");
        return this;
    }

    public APITesting_Lab04_BuilderPattern step2() {
        System.out.println("step2");
        return this;
    }

    public APITesting_Lab04_BuilderPattern step3(String param1) {
        System.out.println("step3");
        return this;


    }

    public static void main(String[] args) {
        APITesting_Lab04_BuilderPattern bp = new APITesting_Lab04_BuilderPattern();
        bp.step1().step2().step3("Sai");

    }
}
