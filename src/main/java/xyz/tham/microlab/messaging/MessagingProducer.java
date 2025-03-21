package xyz.tham.microlab.messaging;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MessagingProducer {
  @Inject 
  @Channel("messages")
  Emitter<String> messageEmitter;

  public void produce(String message) {
    messageEmitter.send(message);
  }
}
