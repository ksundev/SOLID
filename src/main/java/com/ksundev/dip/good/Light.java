package com.ksundev.dip.good;

public class Light implements Switchable{
  private boolean isOn;
  public boolean getIsOn() { return isOn; }

  @Override
  public void on() {
    this.isOn = true;
  }
  @Override
  public void off() {
    this.isOn = false;
  }
}
