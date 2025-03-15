package xyz.tham.microlab;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

@QuarkusTest
class PingResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/ping")
          .then()
             .statusCode(200)
             .body(is("Welcome to Microlab."));
    }

}