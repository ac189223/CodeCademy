package _03_ObjectOrientedJava;

public class _15_Coffe {
    public _15_Coffe(){

    }

    public void addSugar(int sugarCubes){
        System.out.println("Added " + sugarCubes + " sugar cubes!");
    }

    public static void main(String[] args){
        _15_Coffe myCup = new _15_Coffe();
        myCup.addSugar(7);
    }

}
