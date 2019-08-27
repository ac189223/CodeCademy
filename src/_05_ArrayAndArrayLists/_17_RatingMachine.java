package _05_ArrayAndArrayLists;

import java.util.ArrayList;

public class _17_RatingMachine {
    public static void main(String[] args) {

        ArrayList<Double> ratings = new ArrayList<Double>();

        ratings.add(1.7);
        ratings.add(2.5);
        ratings.add(3.5);
        ratings.remove(1);

        System.out.println(ratings.get(1));

    }
}
