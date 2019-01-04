package template;

public class Human extends Character {

  private boolean isNickNameAdded = true;

  public Human(boolean isNickNameAdded) {
    this.isNickNameAdded = isNickNameAdded;
  }

  public Human() {

  }

  //hook 메소드
  boolean isNickNameAdded() {
    return this.isNickNameAdded;
  }

  @Override
  public void selectFace() {
    System.out.println("인간종족 중 얼굴 선택모드 실행");
  }

  @Override
  public void selectTall() {
    System.out.println("인간종족의 키 범위 선택!!");
  }
}
