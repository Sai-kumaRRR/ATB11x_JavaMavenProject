package com.thetestingacademy.ex04_RestAssuredHTTP_Method.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITestingLab11_POST_BDDStyle {
    @Test
    public void test_POST_AUTH() {

        // https://restful-booker.herokuapp.com/auth
        // {
        //"username" : "admin",
        //
        //  "password" : "password123"

        //}

        String payload = "{\n" +
                " \"username\" : \"admin\",\n" +
                " \"password\" : \"password123\"\n" +
                " }";


        RestAssured
                .given()
                        .baseUri("https://restful-booker.herokuapp.com")
                         .basePath("/auth")
                         .contentType(ContentType.JSON)
                .body(payload)
                .log().all()
                .when()
                .post()
                .then().log().all()
                .statusCode(200);

    }

}