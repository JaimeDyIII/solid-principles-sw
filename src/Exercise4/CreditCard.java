package Exercise4;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with Credit Card.");
    }
}
