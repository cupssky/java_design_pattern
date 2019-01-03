package adapter;

public interface ILedFramework {

  //기존메소드, 기존의 기능에서 수정할 메소드 구현, 완전 새로운 메소드 구현
  public void ledOff();

  public void ledOn(String color);

  public void ledBlink(String color);
}
