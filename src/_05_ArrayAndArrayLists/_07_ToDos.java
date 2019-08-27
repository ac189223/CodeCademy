package _05_ArrayAndArrayLists;

import java.util.ArrayList;

public class _07_ToDos {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();

        String toDo1 = "Water plants";
        String toDo2 = "Wash dishes";
        String toDo3 = "Walk the dog";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);


    }
}
