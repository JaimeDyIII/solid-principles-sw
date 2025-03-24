package Exercise4;

public class Order {
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(double amount, PaymentMethod paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
