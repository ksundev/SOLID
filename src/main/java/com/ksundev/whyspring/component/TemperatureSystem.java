package com.ksundev.whyspring.component;

import com.ksundev.whyspring.interfaces.TemperatureControl;

public class TemperatureSystem implements TemperatureControl {
  private int temperature = 22; // 기본 온도 22도
  private Engine engine;

  public TemperatureSystem(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTemperature(int temperature) {
    if (engine.isRunning()) {
      this.temperature = temperature;
      System.out.println("온도를 " + temperature + "도로 설정합니다.");
    } else {
      System.out.println("엔진이 꺼져 있어 온도를 조절할 수 없습니다.");
    }
  }

  @Override
  public int getTemperature() {
    return temperature;
  }
}
