package com.ksundev.dip.good;

public class Door implements  Switchable{
  private boolean isOpen;
  public boolean getIsOpen() { return isOpen; }

  @Override
  public void on() {
    this.isOpen = true;
  }
  @Override
  public void off() {
    this.isOpen = false;
  }
}
