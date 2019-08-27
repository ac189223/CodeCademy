package _03_ObjectOrientedJava;

public class _01_Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public _01_Store(String productType, int inventoryCount, double inventoryPrice) {
        this.productType = productType;
        this.inventoryCount = inventoryCount;
        this.inventoryPrice = inventoryPrice;
    }

    // main method
    public static void main(String[] args) {
        _01_Store lemonadeStand = new _01_Store("lemonade", 42, .99);
        _01_Store cookieShop = new _01_Store("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
}
