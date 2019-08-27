package _03_ObjectOrientedJava;

public class _10_Store {
    // instance fields
    String productType;

    // constructor method
    public _10_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // greet customer method
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {
        _10_Store lemonadeStand = new _10_Store("Lemonade");
        lemonadeStand.greetCustomer("Andrzej");
    }
}
