package Exercise4;

public class EWallet implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with E-Wallet.");
    }
}
