package _04_ConditionalsAndControlFlow;

public class _02_Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public _02_Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        if (shipping == "Regular") {
            return 0;
        } else if (shipping == "Express") {
            return 1.75;
        } else {
            return .50;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        _02_Order book = new _02_Order(true, 9.99, "Express");
        _02_Order chemistrySet = new _02_Order(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
