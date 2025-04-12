package com.ksundev.dip.bad;

public class Door {
  private boolean isOpen;
  public boolean getIsOpen() { return isOpen; }
  public Door() { this.isOpen = false; }

  // 문 여닫기
  public void open() { this.isOpen = true; }
  public void close() { this.isOpen = false; }

}
