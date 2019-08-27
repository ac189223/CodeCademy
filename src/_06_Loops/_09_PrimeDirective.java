package _06_Loops;

import java.util.ArrayList;

public class _09_PrimeDirective {

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

    public static ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        _09_PrimeDirective pd = new _09_PrimeDirective();
        int[] numbers = {6, 2, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));
    }


}
