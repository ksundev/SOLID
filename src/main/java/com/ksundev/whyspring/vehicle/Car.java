package com.ksundev.whyspring.vehicle;

import com.ksundev.whyspring.component.ElectricEngine;
import com.ksundev.whyspring.component.Engine;
import com.ksundev.whyspring.component.FuelEngine;
import com.ksundev.whyspring.component.IdentificationSystem;
import com.ksundev.whyspring.component.MovementSystem;
import com.ksundev.whyspring.component.SteeringSystem;
import com.ksundev.whyspring.component.TemperatureSystem;
import com.ksundev.whyspring.interfaces.EngineControl;
import com.ksundev.whyspring.interfaces.Identifiable;
import com.ksundev.whyspring.interfaces.Movable;
import com.ksundev.whyspring.interfaces.TemperatureControl;
import com.ksundev.whyspring.interfaces.Turnable;

public class Car implements Movable, Turnable, EngineControl, TemperatureControl, Identifiable {
  private final Engine engine;
  private final MovementSystem movementSystem;
  private final SteeringSystem steeringSystem;
  private final TemperatureSystem temperatureSystem;
  private final IdentificationSystem idSystem;

  public Car(String id) {
    // 컴포넌트 초기화
    this.engine = new FuelEngine(); // 여기서 구체 클래스에 의존!! DIP 위반
    this.movementSystem = new MovementSystem(engine);
    this.steeringSystem = new SteeringSystem(engine);
    this.temperatureSystem = new TemperatureSystem(engine);
    this.idSystem = new IdentificationSystem(id);
  }

  // EngineControl 인터페이스 구현 - 엔진 컴포넌트에 위임
  @Override
  public void powerOn() {
    engine.powerOn();
  }

  @Override
  public void powerOff() {
    engine.powerOff();
  }

  // Movable 인터페이스 구현 - 이동 시스템에 위임
  @Override
  public void goForward() {
    movementSystem.goForward();
  }

  @Override
  public void goBackward() {
    movementSystem.goBackward();
  }

  // Turnable 인터페이스 구현 - 조향 시스템에 위임
  @Override
  public void turnLeft() {
    steeringSystem.turnLeft();
  }

  @Override
  public void turnRight() {
    steeringSystem.turnRight();
  }

  // TemperatureControl 인터페이스 구현 - 온도 시스템에 위임
  @Override
  public void setTemperature(int temperature) {
    temperatureSystem.setTemperature(temperature);
  }

  @Override
  public int getTemperature() {
    return temperatureSystem.getTemperature();
  }

  // Identifiable 인터페이스 구현 - 식별 시스템에 위임
  @Override
  public String getId() {
    return idSystem.getId();
  }

  // 테스트를 위한 메인 메서드
  public static void main(String[] args) {
    Car car = new Car("KR001");

    // 엔진 시동 전 동작 시도
    car.goForward(); // 엔진이 꺼져 있어 동작하지 않음
    // 엔진 시동
    car.powerOn();

    // 기본 동작 테스트
    car.goForward();
    car.turnRight();
    car.setTemperature(25);
    System.out.println("현재 온도: " + car.getTemperature() + "도");
    System.out.println("차량 아이디: " + car.getId());
    // 엔진 종료
    car.powerOff();
  }
}
