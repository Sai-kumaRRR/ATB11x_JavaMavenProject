package com.thetestingacademy.ex04_RestAssuredHTTP_Method.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestingLab10_POSTnoBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_NonBDDStyle_CREATE_Token() {
        //URL , METHOD , PAYLOAD/BODY/ HEADER
        //AUTH

        String payload = "{\n" +
                " \"username\" : \"admin\",\n" +
                " \"password\" : \"password123\"\n" +
                " }";

        System.out.println("---- part1 -----");


        // part1 - page condition - preparing request - url , header auth , content-type , payload ,.
        r = RestAssured.given();
        r.baseUri("https://restfulbooker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println(" ---- part2 ----");

        //Making HTTP Request -> part2
        response = r.when().log().all().post();

        System.out.println(" ---- part3 ----");

        // verfication part -> 3
        vr = response.then().log().all();
        vr.statusCode(200);


    }


}
