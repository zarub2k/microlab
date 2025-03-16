package xyz.tham.microlab.books;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * 
 * @author Tham
 */
@ApplicationScoped
public class BookManager {
  private static final List<Book> BOOKS = List.of(
    new Book(1, "Unlock your word power", "Norman Lewis"),
    new Book(2, "The Psychology of Money", "Morgan Housel")
  );

  public List<Book> all() {
    return BOOKS;
  }
}
