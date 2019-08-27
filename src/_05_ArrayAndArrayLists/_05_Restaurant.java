package _05_ArrayAndArrayLists;

import java.util.Arrays;

public class _05_Restaurant {
    public void printSpecials(){
        String[] specials = {"Chicken Mountain", "Lake of Broth", "Wishbone Tower"};
        System.out.println(Arrays.toString(specials));
    }

    public static void main(String[] args){
        _05_Restaurant chickenKitchen = new _05_Restaurant();
        chickenKitchen.printSpecials();
    }
}
