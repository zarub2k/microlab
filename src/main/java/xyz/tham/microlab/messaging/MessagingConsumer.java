package xyz.tham.microlab.messaging;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessagingConsumer {
  
  @Incoming("messages")
  public void consumeMessage(String msg) {
    System.out.println("MessagingConsumer.consumeMessage() " + msg);
  }
}
