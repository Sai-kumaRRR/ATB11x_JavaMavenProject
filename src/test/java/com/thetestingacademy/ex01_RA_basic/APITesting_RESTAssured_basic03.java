package com.thetestingacademy.ex01_RA_basic;

import io.restassured.RestAssured;

public class APITesting_RESTAssured_basic03 {
    public static void main(String[] args) {

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }
}
