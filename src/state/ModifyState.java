package state;

public class ModifyState implements State {

  private static ModifyState modifyState;

  private ModifyState() {
  }

  public static ModifyState getInstanace() {
    if (modifyState == null) {
      modifyState = new ModifyState();
    }
    return modifyState;
  }

  @Override
  public void open() {
    System.out.println("이미 열려있는 파일이 있습니다. 파일을 저장하고 엽니다.");
    save();
  }

  @Override
  public void close() {
    System.out.println("수정된 사항이 있습니다. 파일 저장하고 종료합니다.");
    save();
  }

  @Override
  public void save() {
    System.out.println("현재 내용 저장");
    EditEngine.setMyState(InitState.getInitState());
  }

  @Override
  public void edit(String text) {

  }
}
