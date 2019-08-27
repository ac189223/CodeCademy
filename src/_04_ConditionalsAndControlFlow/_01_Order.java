package _04_ConditionalsAndControlFlow;

public class _01_Order {
    public static void main(String[] args) {

        double itemCost = 30.99;
        if (itemCost > 24.00) {
            System.out.println("High value item!");
        }

        boolean isFilled = false;
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }
    }
}
