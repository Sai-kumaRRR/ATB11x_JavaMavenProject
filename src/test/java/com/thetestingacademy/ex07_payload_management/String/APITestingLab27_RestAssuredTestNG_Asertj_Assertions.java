package com.thetestingacademy.ex07_payload_management.String;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestingLab27_RestAssuredTestNG_Asertj_Assertions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;


    @Test
    public void test_POST() {

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
        validatableResponse.body("booking", Matchers.notNullValue());


        // TestNG - Extract the details of the firstname , booking , lastname from response
        bookingID = response.then().extract().path("booking");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        // TestNG Assertions
        //softAssert vs
        //HardAssert -
        // this means that if any assertion fails
        // the remaining in that test method will not be executed

        Assert.assertEquals(firstname, "Sai");
        Assert.assertEquals(lastname, "Brown");
        Assert.assertNotNull(bookingID);

        // assertj(3rd - Lib to assertions)

        assertThat(bookingID).isNotZero().isNull().isPositive();
        assertThat(firstname).isEqualTo("Sai").isNotBlank().isNotBlank().isNotEmpty().isAlpha();

        // String s = ""; // empty
        // String s2 = " "; // Blank
    }
}
