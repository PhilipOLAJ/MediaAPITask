package com.restAssuredTests;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class SchemaTests {


    @Test
    public void validate1() {

        baseURI = "https://testapi.io/api/ottplatform/media";
        String resp = given()
                .header("Content-Type", "application/json")
                .when().get(baseURI).then().extract().asString();














    }


}


