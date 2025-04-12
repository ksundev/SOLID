package com.ksundev.whyspring.component;

import com.ksundev.whyspring.interfaces.Movable;

public class MovementSystem implements Movable {
  private Engine engine;
  public MovementSystem(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void goForward() {
    if (engine.isRunning()) {
      System.out.println("앞으로 이동합니다.");
    } else {
      System.out.println("엔진이 꺼져있어 이동할 수 없습니다.");
    }
  }

  @Override
  public void goBackward() {
    if (engine.isRunning()) {
      System.out.println("뒤로 이동합니다.");
    } else {
      System.out.println("엔진이 꺼져있어 이동할 수 없습니다.");
    }
  }
}
