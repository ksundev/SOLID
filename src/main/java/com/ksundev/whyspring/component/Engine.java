package com.ksundev.whyspring.component;

import com.ksundev.whyspring.interfaces.EngineControl;

public abstract class Engine implements EngineControl {
  private boolean isRunning;
  public boolean isRunning() { return isRunning; }
}
