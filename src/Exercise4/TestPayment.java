package Exercise4;

public class TestPayment {
    public static void main(String[] args){
        Order order1 = new Order(1000.0, new CreditCard());
        Order order2 = new Order(100.0, new EWallet());
        Order order3 = new Order(10.0, new Cash());

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(order1);
        paymentProcessor.processPayment(order2);
        paymentProcessor.processPayment(order3);
    }
}
