package xyz.tham.microlab.general;

import java.util.Set;

import io.quarkus.test.junit.QuarkusTestProfile;

public class RunWithStaging implements QuarkusTestProfile {
  @Override
  public Set<String> tags() {
    return Set.of("staging");
  }
}
