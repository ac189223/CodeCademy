package _03_ObjectOrientedJava;

public class _16_Calculator {

    public _16_Calculator() { }
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int product(int a, int b) { return a * b; }
    public int modulo(int a, int b) { return a % b; }
    public int divide(int a, int b) { return a / b; }

    public static void main(String[] args) {
        _16_Calculator myCalculator = new _16_Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
    }
}
