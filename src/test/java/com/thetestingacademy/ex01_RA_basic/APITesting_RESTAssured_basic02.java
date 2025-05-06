package com.thetestingacademy.ex01_RA_basic;

import io.restassured.RestAssured;
import java.util.Scanner;

public class APITesting_RESTAssured_basic02 {
    public static void main(String[] args) {

        // Gherkins syntax
        // given -> pre req. - url , header, auth , body
        // when() - HTTP Method? - GET ,/ POST / PUT / PATCH / DELETE
        // Then -> validation -> 200ok , firstname == Sai

        // full url = https:// api.zippopotam.us/IN/
        // base url - https:// api.zippopotam.us
        // base path - /IN/495004

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the pincode!");
        String pincode =  scanner.next();

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

        // Headers, Cookies , Response , Body , ....others

    }
}
