package _06_Loops;

import java.util.ArrayList;

public class _08_PrimeDirective {

    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 6, 29, 28, 33, 11, 100, 101, 43, 89};
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        System.out.println(primeNumbers);
    }

}
