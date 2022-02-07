package decorator;

public class GiftBox implements Box {

    @Override
    public void wrap() {
        System.out.println("선물박스 포장");
    }
}
