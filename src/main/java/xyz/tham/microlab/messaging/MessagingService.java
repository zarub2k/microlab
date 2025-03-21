package xyz.tham.microlab.messaging;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("messaging")
@Produces(MediaType.TEXT_PLAIN)
public class MessagingService {
  @Inject
  MessagingProducer producer;
  
  @GET
  public String tick(@QueryParam("message") String message) {
    producer.produce(message);
    return "Ticked... " + message;
  }
}
