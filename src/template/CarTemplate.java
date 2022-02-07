package template;

public abstract class CarTemplate {

  public final void buildCar() {
    buildHandle();
    buildDoor();
    buildOs();
    buildTire();
  }

  private void buildHandle() {
    System.out.println("핸들 구성 완료 !");
  }

  private void buildDoor() {
    System.out.println("문 구성 완료 !");
  }

  public abstract void buildOs();
  public abstract void buildTire();

}
