package _03_ObjectOrientedJava;

public class _03_Store {
    // declare instance fields here!
    String productType;

    // constructor method
    public _03_Store() {
        System.out.println("I am inside the constructor method.");
    }

    public _03_Store(String productType) {
        this.productType = productType;
    }


    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        _03_Store lemonadeStand = new _03_Store();
        _03_Store colaStand = new _03_Store("Cola");

        System.out.println(lemonadeStand);
        System.out.println(colaStand);

    }
}