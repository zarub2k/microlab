package xyz.tham.microlab.books;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class BookmanagerTest {
  @Inject BookManager bookManager; 

  @Test void testAll() {
    List<Book> books = bookManager.all();
    assertNotNull(books);
    assertEquals(2, books.size());
  }
}
