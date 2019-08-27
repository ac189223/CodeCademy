package _08_InheritanceAndPolymorphism;

public class _051_Noodle {
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    _051_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {
        this.texture = "cooked";
    }
}
