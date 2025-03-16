package xyz.tham.microlab.books;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

@QuarkusTest
public class BookServiceTest {
  @Test
  void testAll() {
    given()
      .when().get("/api/v1/books")
      .then()
          .statusCode(200);
  }
}
