package com.ksundev.ocp.good;

public class Calculator {
  public float calculateArea(Shape shape) {
    return shape.getArea();
  }
  // 도형이 추가되더라도 해당 클래스를 수정할 일이 없음. Good!
}
