package com.ksundev.ocp.good;

public class Circle extends Shape {
  private float radius;

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public float getArea() {
    return (float)(Math.PI *radius * radius);
  }
}
