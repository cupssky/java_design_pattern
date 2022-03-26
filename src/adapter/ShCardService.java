package adapter;

public class ShCardService implements CardService {

    private final ShCardClient shCardClient;

    public ShCardService(ShCardClient shCardClient) {
        this.shCardClient = shCardClient;
    }

    @Override
    public void pay() {
        shCardClient.shCardPay();
    }

    @Override
    public void payCancel() {
        shCardClient.shCardCancel();
    }

}
