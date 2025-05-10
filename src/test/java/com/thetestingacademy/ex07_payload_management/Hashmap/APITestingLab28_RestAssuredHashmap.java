package com.thetestingacademy.ex07_payload_management.Hashmap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class APITestingLab28_RestAssuredHashmap {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_POST() {

        // String payload


        //   String payload = "{\n" +
        //       "\"firstname\" : \"Sai\",\n" +
        //     "\"lastname\" : \"Brown\",\n" +
        //   "\totalprice\": 111,\n" +
        //    "\"depositpaid\" : true,\n" +
        //    "\"bookingdates\" :{\n" +
        //   "\"checkin\": \"2024-01-01\",\n" +
        //   "\"checkout\" : \"2024-01-01\"\n" +
        //   "},\n" +
        //   " \"additionalneeds\" : \"Breakfast\"\n" +
        //  "}";

        // Hashmap -> key and map
        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
        jsonBodyUsingMap.put("firstname", "Sai");
        jsonBodyUsingMap.put("lastname", "Kumar");
        jsonBodyUsingMap.put("totalprice", 123);
        jsonBodyUsingMap.put("despoitpaid", false);


        Map<String, Object> bookingDatesMap = new LinkedHashMap();
        bookingDatesMap.put("checkin","2018-01-01");
        bookingDatesMap.put("checkout","2019-01-01");

        jsonBodyUsingMap.put("bookingdates",bookingDatesMap);
        jsonBodyUsingMap.put("additionalneeds","Breakfast");
        System.out.println(jsonBodyUsingMap);

        // Hashmap -> json->
        // 1 .) gson
        //2.) jackson API




        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload).log().all();


        Response response = requestSpecification.when().post();

        //GET validatable response to perform validation
        validatableResponse = response.then().log().all();

        //Rest assured
        validatableResponse.statusCode(200);

        // firstname == Sai , last name = kumar
        // bookingId shouldn't null

        validatableResponse.body("booking.firstname", Matchers.equalTo("Sai"));
        validatableResponse.body("booking.firstname", Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));
        validatableResponse.body("booking", Matchers.notNullValue());




    }
}