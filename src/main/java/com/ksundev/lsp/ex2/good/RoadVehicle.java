package com.ksundev.lsp.ex2.good;

public abstract class RoadVehicle implements Movable, Turnable {
  public abstract void goForward();
  public abstract void goBackward();
  public abstract void turnLeft();
  public abstract void turnRight();
}
