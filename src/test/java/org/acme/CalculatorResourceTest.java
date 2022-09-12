package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/calculator/50/19")
          .then()
             .statusCode(200)
             .body(is("The result of 50 + 19 Equals 69"));
    }

}