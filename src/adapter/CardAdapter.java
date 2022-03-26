package adapter;

public class CardAdapter {
    
    private final CardService cardService;

    public CardAdapter(CardService cardService) {
        this.cardService = cardService;
    }

    public void pay() {
        cardService.pay();
    }

    public void payCancel() {
        cardService.payCancel();
    }
}

