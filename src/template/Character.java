package template;

public abstract class Character {

  //메서드 앞에 final 붙이면 오버라이드 금지됨
  final void makeCharacter() {
    decideID();
    selectFace();
    selectTall();

    //훅 hook.
    if (isNickNameAdded()) {
      addNickName();
    }
  }

  public void decideID() {
    System.out.println("id 선택");
  }

  public abstract void selectFace();

  public abstract void selectTall();

  public void addNickName() {
    System.out.println("닉네임 추가");
  }

  //hook 메소드
  boolean isNickNameAdded() {
    return true;
  }
}
