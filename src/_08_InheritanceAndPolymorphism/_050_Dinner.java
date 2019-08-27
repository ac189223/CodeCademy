package _08_InheritanceAndPolymorphism;

public class _050_Dinner {

    private void makeNoodles(_051_Noodle noodle, String sauce) {
        noodle.cook();
        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");
    }

    public static void main(String[] args) {
        _050_Dinner noodlesDinner = new _050_Dinner();
        _051_Noodle biangBiang = new _052_BiangBiang();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    }

}
