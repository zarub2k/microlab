package xyz.tham.microlab.books;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class BookService {
  @Inject BookManager manager;

  @GET
  public List<Book> all() {
    return manager.all();
  }
}
