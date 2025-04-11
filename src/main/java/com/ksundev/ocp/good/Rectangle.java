package com.ksundev.ocp.good;

public class Rectangle extends Shape {
  private float width;
  private float height;

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  @Override
  public float getArea() {
    return width * height;
  }
}
