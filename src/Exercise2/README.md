### Exercise 2
The following code violates the Open/Close Principle.  Refactor the program to remove the violation (25 points).
```Java
public class Customer {

    private String name;
    private String type; // "Student", "Senior Citizen", or "Regular"

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public double calculateDiscount(double amount) {
        if (type.equalsIgnoreCase("Student")) {
            return amount * 0.05;
        } else if (type.equalsIgnoreCase("Senior Citizen")) {
            return amount * 0.10;
        } else {
            return 0.0; // No discount for Regular
        }
    }

    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }
}
```
