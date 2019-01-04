package state;

public class InitState implements State {

  private static InitState initState;

  private InitState() {
  }

  public static InitState getInitState() {
    if (initState == null) {
      initState = new InitState();
    }
    return initState;
  }

  @Override
  public void open() {
    System.out.println("열림");
  }

  @Override
  public void close() {
    System.out.println("닫혔음");
  }

  @Override
  public void save() {
    System.out.println("저장");
  }

  @Override
  public void edit(String text) {
    System.out.println("편집");
    EditEngine.setMyState(InitState.getInitState());

  }
}
