package com.ksundev.lsp.ex1;

public class LSPTest1 {

  public static void main(String[] args) {
    // Person(부모) 생성
    Person p = new Person("김부모");
    // Student(자식) 생성
    Student s = new Student("김자식", "CS");
    // 부모클래스로 선언된 자식객체 생성
    Person p2 = new Student("김자식2", "Music");
    // 자식클래스로 선언된 부모객체 생성
//  Student s2 = new Person("김부모2"); // 생성 불가능!

    p.sleep(); // ok
    s.sleep(); // ok

    s.study(); // ok
//  p.study(); // NOT OK!

    p2.sleep();
//  p2.study(); // NOT OK!
  }
}
