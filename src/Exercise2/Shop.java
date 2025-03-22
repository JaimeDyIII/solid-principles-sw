package Exercise2;

public class Shop {
    public static void main(String[] args){
        Customer leo = new Customer("Leo", "Senior Citizen", new SeniorCitizenDiscount());
        Customer edward = new Customer("Edward", "Student", new StudentDiscount());
        Customer boris = new Customer("Boris", "Regular", new RegularDiscount());

        short amount = 100;

        System.out.println(leo.getName() + ", a " + leo.getType() + " customer, has paid a total of ₱" + leo.applyDiscount(amount) + " from ₱" + amount + " original cost after discount.");
        System.out.println(edward.getName() + ", a " + edward.getType() + " customer, has paid a total of ₱" + edward.applyDiscount(amount) + " from ₱" + amount + " original cost after discount.");
        System.out.println(boris.getName() + ", a " + boris.getType() + " customer, has paid a total of ₱" + boris.applyDiscount(amount) + " from ₱" + amount + " original cost after original cost discount.");
    }
}
