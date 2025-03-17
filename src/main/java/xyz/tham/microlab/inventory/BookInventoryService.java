package xyz.tham.microlab.inventory;

import java.util.List;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import jakarta.inject.Inject;
import xyz.tham.microlab.books.Book;
import xyz.tham.microlab.books.BookManager;

@GraphQLApi
public class BookInventoryService {
  @Inject BookManager bookManager;

  @Query
  public List<Book> books() {
    return bookManager.all();
  }

  @Mutation
  public Book addBook(Book book) {
    return bookManager.add(book);
  }
}
