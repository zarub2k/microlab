package xyz.tham.microlab.general;

import org.jboss.logging.Logger;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("virtual")
@Produces(MediaType.TEXT_PLAIN)
@RunOnVirtualThread
public class VirtualThreadService {
  private static final Logger LOGGER = Logger.getLogger(VirtualThreadService.class);

  @GET
  public String test() {
    LOGGER.info("Enters VirtualThreadService.test()");
    return "Virtual thread is called: " + Thread.currentThread().getClass();
  }
}
