package com.ksundev.lsp.ex2.bad;

public abstract class Vehicle {
  public void goForward() {
    System.out.println(this.getClass().getName() + " goForward");
  }

  public void goBackward() {
    System.out.println(this.getClass().getName() + " goBackward");
  }

  public void turnLeft() {
    System.out.println(this.getClass().getName() + " turnLeft");
  }

  public void turnRight() {
    System.out.println(this.getClass().getName() + " turnRight");
  }
}
