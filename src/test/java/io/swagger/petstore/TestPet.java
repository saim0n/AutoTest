package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class TestPet {

    @Test
    public void petTest(){
        RestAssured.given()
                .baseUri("https://petstore.swagger.io/")
                .basePath("/v2/pet/1")
                .contentType(ContentType.JSON)
                .header("api_key" , "petstoreauth")
                .when().get()
                .then().extract().response().prettyPrint();
    }
}
