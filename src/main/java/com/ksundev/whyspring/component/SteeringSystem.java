package com.ksundev.whyspring.component;

import com.ksundev.whyspring.interfaces.Turnable;

public class SteeringSystem implements Turnable {
  private Engine engine;
  public SteeringSystem(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void turnLeft() {
    if (engine.isRunning()) {
      System.out.println("좌회전합니다.");
    } else {
      System.out.println("엔진이 꺼져 있어 회전할 수 없습니다.");
    }
  }

  @Override
  public void turnRight() {
    if (engine.isRunning()) {
      System.out.println("우회전합니다.");
    } else {
      System.out.println("엔진이 꺼져 있어 회전할 수 없습니다.");
    }
  }
}