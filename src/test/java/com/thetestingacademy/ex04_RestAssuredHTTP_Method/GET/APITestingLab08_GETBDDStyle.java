package com.thetestingacademy.ex04_RestAssuredHTTP_Method.GET;


import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestingLab08_GETBDDStyle{

@Test
            public void test_GET_positive(){
                String pin_code = "388620";
                RestAssured
                        .given()
                        .baseUri("https://api.zippopotam.com")
                        .basePath("/IN/"+pin_code)
                        .when()
                        .log()
                        .all()
                        .get()
                        .then()
                        .log().all()
                        .statusCode(200);
            }
        }



