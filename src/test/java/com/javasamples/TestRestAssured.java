package com.javasamples;
import org.hamcrest.Matchers;
import org.junit.Test;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

public class TestRestAssured {

    @Test
    public void restAssuredTest() {
        ValidatableResponse response =
            given().queryParam("type", "json").when()
                .get("http://localhost:8080/employee-management-system/viewEmployee/4").then();
        System.out.println("Response is - "+response.extract().body().asString());
        response.body(Matchers.containsString("emp4"));
    }
}