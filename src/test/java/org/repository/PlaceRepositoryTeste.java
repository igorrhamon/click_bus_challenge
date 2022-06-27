package org.repository;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;


@QuarkusTest
public class PlaceRepositoryTeste {
    
    @Test
    public void test() {
        given().
        contentType("application/json").
        when().
        get("/places").
        then().
        statusCode(200);
    }
    
    
}
