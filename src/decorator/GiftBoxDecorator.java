package decorator;

public class GiftBoxDecorator implements Box {

    private Box box;

    public GiftBoxDecorator(Box box) {
        this.box = box;
    }

    @Override
    public void wrap() {
        box.wrap();
    }
}
