package _03_ObjectOrientedJava;

public class _09_Store {
    // instance fields
    String productType;

    // constructor method
    public _09_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        _09_Store lemonadeStand = new _09_Store("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
