package _03_ObjectOrientedJava;

public class _04_Store {
    // instance fields
    String productType;

    // constructor method
    public _04_Store(String product) {
        productType = product;
    }

    // main method
    public static void main(String[] args) {
        _04_Store lemonadeStand = new _04_Store("lemonade");
        System.out.println(lemonadeStand.productType);
    }
}
