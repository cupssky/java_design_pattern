package abfactory;

public class AmericaFactory extends AbstractFactory {

  @Override
  public HamProduct createHam() {
    return new AmericaHamProduct();
  }

  @Override
  public BreadProduct creatBread() {
    return new AmericaBreadProduct();
  }
}
