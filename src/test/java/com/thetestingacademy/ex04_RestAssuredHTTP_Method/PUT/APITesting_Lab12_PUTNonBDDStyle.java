package com.thetestingacademy.ex04_RestAssuredHTTP_Method.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APITesting_Lab12_PUTNonBDDStyle {

    // PUT
    // Token , booking id
    // public void get_token()
    // public void get_token_booking_id(){}


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    public void test_put_non_BDDStyle() {


        String token = "038ba9295d600";
        String bookingid = "582";

        String payloadPUT = "{\n" +
                " \"firstname\" : \"Sai\",\n" +
                "\"lastname\" : \"Kumar\",\n" +
                "\"totalprice\" : \"111,\n" +
                "\"depositpaid\" : false,\n" +
                "\bookingdates\": {\n +" +
                "\"checkin\" : \"2025-01-01\",\n" +
                "\"checkout\" : \"2025-01-01\"\n" +
                " },\n" +
                " \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+ bookingid);
        r.contentType(ContentType.JSON);
        //r.auth().oaut
        r.cookie("token",token);
        r.body(payloadPUT).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200);


    }
}