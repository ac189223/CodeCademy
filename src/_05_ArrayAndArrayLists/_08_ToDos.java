package _05_ArrayAndArrayLists;

import java.util.ArrayList;

public class _08_ToDos {

    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Print the size of each ArrayList below:
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());

        // Print the name of the detective with the larger to-do list:
        if (sherlocksToDos.size() > poirotsToDos.size()) {
            System.out.println("Sherlock");
        } else if (sherlocksToDos.size() < poirotsToDos.size()) {
            System.out.println("Poirot");
        } else {
            System.out.println("Same");
        }

        System.out.print("Sherlock's third to-do:");
        // Print Sherlock's third to-do:
        System.out.println(sherlocksToDos.get(2));

        System.out.print("Poirot's second to-do:");
        // Print Poirot's second to-do:
        System.out.println(poirotsToDos.get(1));

    }

}
