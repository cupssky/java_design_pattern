package factory;

public class RealTransCreator extends TransCreator {

  @Override
  public TransProduct transCreate(String trans) {
    if (trans.equals("taxi")) {
      return new TransProductTaxi();
    } else {
      return new TransProductBicycle();
    }
  }
}
