package _04_ConditionalsAndControlFlow;

public class _04_Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public _04_Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.print("Shipping. ");
            double shippingCost = calculateShipping();
            System.out.println("Shipping cost: " + shippingCost);
        } else {
            System.out.println("Order not ready");
        }
        System.out.println("");
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        _04_Order pens = new _04_Order(true, 3, "Express");
        pens.ship();
        _04_Order books = new _04_Order(true, 100, "Slow");
        books.ship();
        _04_Order bikeParts = new _04_Order(true, 30, "Regular");
        bikeParts.ship();
        _04_Order food = new _04_Order(true, 18, "Train");
        food.ship();
        _04_Order drinks = new _04_Order(false, 30, "Express");
        drinks.ship();
        _04_Order radio = new _04_Order(false, 60, "Slow");
        radio.ship();
    }
}
