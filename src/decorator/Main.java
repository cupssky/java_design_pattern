package decorator;

public class Main {

    public static void main(String[] args) {
        Box box = new GiftBox();
        FoodBoxDecorator foodBoxDecorator = new FoodBoxDecorator(box);
        foodBoxDecorator.wrap();
    }
}
