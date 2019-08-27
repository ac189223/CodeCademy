package _03_ObjectOrientedJava;

public class _13_Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public _13_Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // Returns info about store
    public String toString() {
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // main method
    public static void main(String[] args) {
        _13_Store lemonadeStand = new _13_Store("Lemonade", 3.75);
        _13_Store cookieShop = new _13_Store("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }
}
