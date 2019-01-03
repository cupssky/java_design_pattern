package abfactory;

public class KoreaFactory extends AbstractFactory {

  @Override
  public HamProduct createHam() {
    return new KoreaHamProduct();
  }

  @Override
  public BreadProduct creatBread() {
    return new KoreaBreadProduct();
  }
}
