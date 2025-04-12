package com.ksundev.whyspring.component;

import com.ksundev.whyspring.interfaces.EngineControl;

public class FuelEngine extends Engine {

  @Override
  public void powerOn() {
    System.out.println("연료엔진을 켭니다.");
  }

  @Override
  public void powerOff() {
    System.out.println("연료엔진을 끕니다.");
  }
}
