package proxy;

public class CreditCard implements Payment {

    Payment cash = new Cash();

    @Override
    public void pay(int amount) {
        if (amount > 100) {
            System.out.println(amount + "현금");
        } else {
            cash.pay(amount);   
        }
    }
}
