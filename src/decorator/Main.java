package decorator;

public class Main {

  public static void main(String[] args) {
    Drink drink = new Americano();
    System.out.println(drink.getName());
    System.out.println(drink.cost());

    drink = new Shot(drink);
    System.out.println(drink.getName());
    System.out.println(drink.cost());

    drink = new Syrup(drink);
    System.out.println(drink.getName());
    System.out.println(drink.cost());
  }
}
