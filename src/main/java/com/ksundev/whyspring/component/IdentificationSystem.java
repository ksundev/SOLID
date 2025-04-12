package com.ksundev.whyspring.component;

import com.ksundev.whyspring.interfaces.Identifiable;

public class IdentificationSystem implements Identifiable {
  private final String id;

  public IdentificationSystem(String id) {
    this.id = id;
  }

  @Override
  public String getId() {
    return id;
  }
}
