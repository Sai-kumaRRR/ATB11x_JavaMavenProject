package com.thetestingacademy.ex01_RA_concept02;

import io.restassured.RestAssured;

public class APITestingLab06MultiTestCaseExample02 {
    public static void main(String[] args) {


        String pincode = "495004";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode/495004")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode/495004")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);




















    }
}
