package com.thetestingacademy.ex06_TestNG_example_Assertions;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class APITestingLab27_RestAssured_TestNG__Asertj_Assertions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;


    @Test
    public void test_createBooking_POST() {

        // String payload
        String payload = "{\n" +
                "\"firstname\" : \"Sai\",\n" +
                "\"lastname\" : \"Brown\",\n" +
                "\totalprice\": 111,\n" +
                "\"depositpaid\" : true,\n" +
                "\"bookingdates\" :{\n" +
                "\"checkin\": \"2024-01-01\",\n" +
                "\"checkout\" : \"2024-01-01\"\n" +
                "},\n" +
                " \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

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
        validatableResponse.body("bookingid", Matchers.notNullValue());



        // TestNG - Extract the details of the firstname , bookingid , lastname from
        // bookingid = response.then().extract().path("bookingid");
    }
}
