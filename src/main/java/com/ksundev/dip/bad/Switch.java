package com.ksundev.dip.bad;

public class Switch {
  public boolean isOn;
  public Door door; // 구체 클래스에 직접 의존
  public Light light; // 새로운 장치 추가
  private String deviceType; // 어떤 걸 컨트롤 할 지 지정해주어야함..

  public void toggle() {
    if (isOn) {
      if (deviceType.equals("door")) {
        door.close();
      } else if (deviceType.equals("light")) {
        light.off();
      }
      isOn = false;
    } else {
      if (deviceType.equals("door")) {
        door.open();
      } else if (deviceType.equals("light")) {
        light.on();
      }
      isOn = true;
    }
  }
}
