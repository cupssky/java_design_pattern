package decorator;

public class Americano extends Drink {

  public Americano() {
    name = "americano";
  }

  @Override
  public int cost() {
    return 2000;
  }
}
