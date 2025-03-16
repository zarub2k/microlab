package xyz.tham.microlab;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

@QuarkusTest
class PingServiceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/api/v1/ping")
          .then()
             .statusCode(200)
             .body(is("Welcome to Microlab!"));
    }

}