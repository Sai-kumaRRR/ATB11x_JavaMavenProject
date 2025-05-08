package com.thetestingacademy.ex01_RA_concept02;

public class APITestingLab03_RestAssured_NOPattern {


    // NoDesignPattern
    public void step1() {
        System.out.println("step1");

    }

    public void step2() {
        System.out.println("step2");

    }

    public void step3(String param1) {
        System.out.println("step3");

    }

    public static void main(String[] args) {
        APITestingLab03_RestAssured_NOPattern np = new APITestingLab03_RestAssured_NOPattern();
        np.step1();
        np.step2();
        np.step3("Sai");


    }


}