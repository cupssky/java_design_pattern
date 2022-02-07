package template;

public class Model3 extends CarTemplate {

  @Override
  public void buildOs() {
    System.out.println("테슬라 OS 구성 완료 !");
  }

  @Override
  public void buildTire() {
    System.out.println("투어링 타이어 구성 완료 !");
  }
}
