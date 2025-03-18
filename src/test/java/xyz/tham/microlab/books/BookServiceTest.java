package xyz.tham.microlab.books;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;

@QuarkusTest
public class BookServiceTest {
  // @TestHTTPEndpoint(BookService.class)
  // @TestHTTPResource()
  // URL bookService;

  @Test
  void testAllService() {
    given()
      .when().get("/api/v1/books")
      .then()
          .statusCode(200);
  }

  /*@Test
  public void testAllAnotherWay() {
    given()
      .when()
      .get(bookService)
      .then()
      .statusCode(200);
  }*/
}
