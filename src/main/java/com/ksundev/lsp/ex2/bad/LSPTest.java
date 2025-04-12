package com.ksundev.lsp.ex2.bad;

public class LSPTest {
  public static void main(String[] args) {
    Car car = new Car();
    Truck truck = new Truck();
    Train train = new Train();

    car.turnRight();
    truck.turnRight();
    train.turnRight(); // 기차가 우회전?! 탈선 발생...!!
    // 기차도 Vehicle을 상속받았기 때문에 Vehicle의 모든 메서드를 쓸 수 있어야 한다.
    // 하지만 기차는 좌,우회전을 할 수 없다. 이는 LSP 위반 사례로 볼 수 있다! 이것을 해결해보자.
  }
}
