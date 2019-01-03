package factory;

public class TransProductTaxi extends TransProduct {

  @Override
  void useTrans() {
    System.out.println("Using Taxi");
  }
}
