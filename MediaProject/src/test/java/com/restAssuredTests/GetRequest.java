package com.restAssuredTests;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest {

    @Test (priority = 1)
    public void getMusicTracks()
    {


        ValidatableResponse validatableResponse = given()
                .when()
                .get("https://testapi.io/api/ottplatform/media")
                .then()
                .statusCode(200);


    }


    @Test (priority = 2)
    public void getResponseTime()
    {

        RestAssured.baseURI = "https://testapi.io/api/ottplatform/media";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        String j = response.asString();

        long c = response.getTime();
        System.out.println("Response time in Milliseconds:"+ c);

        ValidatableResponse validatableResponse = given()
                .when()
                .get("https://testapi.io/api/ottplatform/media")
                .then()
                .statusCode(200);
        validatableResponse.time(Matchers.lessThan(1000L));
    }

    @Test (priority = 3)
    public void verifyIdFields()
    {
        RestAssured.baseURI = "https://testapi.io/api/ottplatform/media";
        String resp = given()
                .header("Content-Type", "application/json")
                .when().get(baseURI).then().extract().asString();





    }

    @Test (priority = 4)
    public void verifyResponseHeader() {
        ValidatableResponse validatableResponse = given()
                .when()
                .get("https://testapi.io/api/ottplatform/media")
                .then()
                .log().headers();
    }


    @Test (priority = 5)
    public void verifyResponseHeaderDate() {
        ValidatableResponse validatableResponse = given()
                .when()
                .get("https://testapi.io/api/ottplatform/media")
                .then()
                .assertThat().header("Date","Fri, 21 May");
    }



















}
