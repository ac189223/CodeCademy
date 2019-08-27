package _08_InheritanceAndPolymorphism;

public class _010_Noodle {
    double lengthInCentimeters;
    String shape;
    String texture = "brittle";

    public void cook() {
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        _011_Spaghetti spaghettiPomodoro = new _011_Spaghetti();
        System.out.println(spaghettiPomodoro.texture);
    }
}
