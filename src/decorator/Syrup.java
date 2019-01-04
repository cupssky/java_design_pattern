package decorator;

public class Syrup extends DrinkDecorator {

  public Syrup(Drink drink) {
    this.drink = drink;
  }

  @Override
  public int cost() {
    return 100 + drink.cost();
  }

  @Override
  public String getName() {
    return "syrup" + drink.getName();
  }
}
