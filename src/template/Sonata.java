package template;

public class Sonata extends CarTemplate{

  @Override
  public void buildOs() {
    System.out.println("소나타 OS 구성 완료 !");
  }

  @Override
  public void buildTire() {
    System.out.println("현대타이어 구성 완료 !");
  }
}
