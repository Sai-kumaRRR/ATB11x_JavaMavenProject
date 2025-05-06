package com.thetestingacademy.ex01_RA_basic;

import io.restassured.RestAssured;

public class APITesting_RESTAssured_basic01 {
    public static void main(String[] args) {

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                .when()
                .get()
                .then()
                .log().all().statusCode(201);
    }
}
