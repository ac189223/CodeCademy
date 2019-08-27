package _08_InheritanceAndPolymorphism;

public class _060_Noodle {
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    _060_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }

    public static void main(String[] args) {

        _060_Noodle spaghetti, ramen, pho;
        spaghetti = new _061_Spaghetti();
        ramen = new _062_Ramen();
        pho = new _063_Pho();

        _060_Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        for (_060_Noodle noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }

    }
}
