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

    @Test;
    public void test_NonBDDStyle_CREATE_Token(){
        //URL , METHOD , PAYLOAD/BODY/ HEADER
        //AUTH

        String payload = "{\n"+
                         " \"username\" : \"admin\",\n" +
                          " \"password\" : \"password123\"\n" +
                          " }";

        System.out.println("---- part1 -----");

        r = RestAssured.given();
        r.baseUri("https://restfulbooker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();
    }






















}
