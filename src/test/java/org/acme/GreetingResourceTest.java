package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class CheckForPrimeResourceTest {
    @Test
    void testPrimeEndpoint() {
        given()
          .when().get("/isprime/199") // Test with 199, just a magic number
          .then()
             .statusCode(200)
             .body(is("true"));
    }
}
