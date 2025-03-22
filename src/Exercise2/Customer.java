package Exercise2;

public class Customer{
    private String name;
    private String type; // "Student", "Senior Citizen", or "Regular"
    private DiscountStrategy discountStrategy;

    public Customer(String name, String type, DiscountStrategy discountStrategy) {
        this.name = name;
        this.type = type;
        this.discountStrategy = discountStrategy;
    }

    public double applyDiscount(double amount) {
        return amount - discountStrategy.calculateDiscount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}