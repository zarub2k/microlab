package xyz.tham.microlab.books;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * 
 * @author Tham
 */
@ApplicationScoped
public class BookManager {
  private static final List<Book> BOOKS = new CopyOnWriteArrayList<>();

  @PostConstruct
  public void init() {
    BOOKS.add(new Book(1, "Unlock your word power", "Norman Lewis"));
    BOOKS.add(new Book(2, "The Psychology of Money", "Morgan Housel"));
  }
  
  public List<Book> all() {
    return BOOKS;
  }

  public Book add(Book book) {
    System.out.println("Enters BookManager.add()");

    int size = BOOKS.size();
    book.setId(size++);

    boolean response = BOOKS.add(book);
    System.out.println(response);
    return book;
  }
}
