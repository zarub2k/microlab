package xyz.tham.microlab.general;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;

@QuarkusTest
@TestProfile(RunWithStaging.class)
public class StagingTest {
  
  @Test
  public void testStaging() {
    System.out.println("testStaging() is called");
  }
}
