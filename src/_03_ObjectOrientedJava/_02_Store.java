package _03_ObjectOrientedJava;

public class _02_Store {

    // new method: constructor!
    public _02_Store() {
        System.out.println("I am inside the constructor method.");
    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        _02_Store lemonadeStand = new _02_Store();
        // print the instance below
        System.out.println(lemonadeStand);
    }
}
