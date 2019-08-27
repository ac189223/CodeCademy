package _03_ObjectOrientedJava;

public class _11_Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public _11_Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // main method
    public static void main(String[] args) {
        _11_Store lemonadeStand = new _11_Store("Lemonade", 3.75);
        System.out.println(lemonadeStand.price);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}
