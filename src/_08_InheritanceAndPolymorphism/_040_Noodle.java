package _08_InheritanceAndPolymorphism;

public class _040_Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    _040_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {
        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        _041_Spaetzle kaesespaetzle = new _041_Spaetzle();
        kaesespaetzle.cook();
    }

}
