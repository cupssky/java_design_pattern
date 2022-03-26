package adapter;

public class Main {

  public static void main(String[] args) {
    CardAdapter cardAdapter = new CardAdapter(new ShCardService(new ShCardClient()));
    cardAdapter.pay();
    cardAdapter.payCancel();
  }
}
