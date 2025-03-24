package Exercise4;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Paying "  + amount + " with Cash.");
    }
}
