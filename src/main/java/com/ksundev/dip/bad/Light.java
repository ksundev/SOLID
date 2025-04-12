package com.ksundev.dip.bad;

public class Light {
  private boolean isOn;
  public boolean getIsOn() { return isOn; }

  // 불 켜고 끄기
  public void on() { this.isOn = true; }
  public void off() { this.isOn = false; }
}
// new face 전등 등장!