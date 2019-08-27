package _06_Loops;

import java.util.ArrayList;

public class _10_OddOrEven {

    public static boolean isOdd(int number) {
        boolean test = true;
        if (number % 2 == 0) {
             test = false;
        }
        return test;
    }

    public static ArrayList<Integer> listOfOddOrEven(int[] numbers, String type) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int number : numbers) {
            if (((type == "Odd") && isOdd(number)) || ((type == "Even") && !isOdd(number))) {
                results.add(number);
            }
        }
        return results;
    }

    public static void main(String[] args) {

        _10_OddOrEven oddOrEven = new _10_OddOrEven();
        int[] numbers = {6, 2, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(oddOrEven.listOfOddOrEven(numbers, "Odd"));
        System.out.println(oddOrEven.listOfOddOrEven(numbers, "Even"));
    }

}
