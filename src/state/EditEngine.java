package state;

public class EditEngine {

  private static State myState = InitState.getInitState();
  private String text = "";

  public static void setMyState(State state) {
    myState = state;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void open() {
    myState.open();
    System.out.println("문서 open");
  }

  public void close() {
    myState.close();
    System.out.println("문서 종료");
  }
}
