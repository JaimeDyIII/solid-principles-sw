package Exercise4;

public class PaymentProcessor {
    public void processPayment(Order order){
        PaymentMethod paymentMethod = order.getPaymentMethod();

        if(paymentMethod == null) throw new IllegalArgumentException("No payment selection selected");

        paymentMethod.pay(order.getAmount());
    }
}