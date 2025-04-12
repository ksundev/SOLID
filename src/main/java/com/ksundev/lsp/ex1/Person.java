package com.ksundev.lsp.ex1;

public class Person {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println(name + "이(가) 잠을 잡니다.");
  }

  public Person(String name) {
    this.name = name;
  }
}
