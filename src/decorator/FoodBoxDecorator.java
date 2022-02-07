package decorator;

public class FoodBoxDecorator extends GiftBoxDecorator {

    public FoodBoxDecorator(Box box) {
        super(box);
    }

    @Override
    public void wrap() {
        super.wrap();
        System.out.print("음식 선물 박스 포장");
    }
}
