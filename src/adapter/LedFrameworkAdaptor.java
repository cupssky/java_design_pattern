package adapter;

public class LedFrameworkAdaptor implements ILedFramework {

  //1. 확장하려는 클래스를 멤버변수로 선언.
  public LedFramework ledFramework;

  //2.생성자에서 생성.
  public LedFrameworkAdaptor() {
    ledFramework = new LedFramework();
  }

  //3. 기존메소드, 기존의 기능에서 수정할 메소드 구현, 완전 새로운 메소드 구현
  @Override
  public void ledOff() {
    System.out.println("Led Off");
  }

  @Override
  public void ledOn(String color) {
    System.out.println(color);
  }

  @Override
  public void ledBlink(String color) {
    for (int i = 0; i < 9; i++) {
      System.out.println("Led Blink");
    }
  }
}
