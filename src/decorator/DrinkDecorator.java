package decorator;

public abstract class DrinkDecorator extends Drink {

  protected Drink drink;

  public abstract String getName();
}
