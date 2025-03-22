package Exercise2;

public class StudentDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount){
        return amount * 0.05;
    }
}
