package com.ksundev.lsp.ex1;

public class Student extends Person {
  private String major; // protected 대신 private 사용

  public Student(String name, String major) {
    super(name);
    this.major = major;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void study() {
    System.out.println(getName() + "이(가) " + major + "을(를) 공부합니다.");
  }

  // LSP를 지키는 오버라이드
  @Override
  public void sleep() {
    super.sleep(); // 부모 클래스의 동작을 유지
  }
}