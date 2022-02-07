package factory;

public class FactorySample {

  public static void main(String[] args) {
    GigaFactory gigaFactory = new CarMachine();
    Tesla tesla = gigaFactory.create(TeslaType.MODEL3);
    System.out.println(tesla.getCarName());
  }
}
