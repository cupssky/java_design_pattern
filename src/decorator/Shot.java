package decorator;

public class Shot extends DrinkDecorator {

  public Shot(Drink drink) {
    this.drink = drink;
  }

  @Override
  public int cost() {
    return 200 + drink.cost();
  }

  @Override
  public String getName() {
    return "shot" + drink.getName();
  }
}
