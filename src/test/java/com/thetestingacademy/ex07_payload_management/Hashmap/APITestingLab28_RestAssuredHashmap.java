package com.thetestingacademy.ex07_payload_management.Hashmap;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITestingLab28_RestAssuredHashmap {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_createBooking_POST() {

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
                Map<String,Object>jsonBodyUsingMap = new LinkedHashMap<>();
                jsonBodyUsingMap.put("firstname","Sai");
                jsonBodyUsingMap.put("lastname","Kumar");
                jsonBodyUsingMap.put("totalprice",123);
                jsonBodyUsingMap.put("despoitpaid",false);

    }
}