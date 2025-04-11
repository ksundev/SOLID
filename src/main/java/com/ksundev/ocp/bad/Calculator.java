package com.ksundev.ocp.bad;

public class Calculator {
  // 사각형 넓이 구하기
  public float GetRectangleArea(Rectangle rectangle) {
    return rectangle.width * rectangle.height;
  }

  // 원 넓이 구하기
  public float GetCircleArea(Circle circle) {
    return (float) (Math.PI * circle.radius * circle.radius);
  }

  // 오각형
  // 육각형
  // 도형이 추가될 때마다 계속해서 수정되어야 한다... OCP 위반!
}
