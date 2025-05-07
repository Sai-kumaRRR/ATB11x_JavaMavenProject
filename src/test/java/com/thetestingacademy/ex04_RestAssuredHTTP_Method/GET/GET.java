package com.thetestingacademy.ex04_RestAssuredHTTP_Method.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GET {
    public static class APITestingLab09_NoBDDStyle {

        RequestSpecification r;
        Response response;
        ValidatableResponse vr;


        @Test
        public void test_GET_NonBDD_Positive() {

            String pincode = "560066";
            //given

            r = RestAssured.given();
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/IN/" + pincode);

            // when
            response = r.when().log().all().get();
            System.out.println(response.asString());

            //then
            vr = response.then().log().all();
            vr.statusCode(200);


        }
     @Test
    public void test_GET_NonBDD_Negative(){

        String pincode = "@";
        //given

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        // when
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //then
        vr = response.then().log().all();
        vr.statusCode(200);


    }
    }

    public static class APITestingLab08_BDDStyle {


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
}
