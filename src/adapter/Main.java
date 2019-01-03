package adapter;

public class Main {

  public static void main(String[] args) {
    ILedFramework led = new LedFrameworkAdaptor();
    led.ledOff();
  }
}
