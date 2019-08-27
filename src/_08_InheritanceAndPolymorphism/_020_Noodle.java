package _08_InheritanceAndPolymorphism;

public class _020_Noodle {

    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    _020_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        _020_Noodle favourites = new _020_Noodle(10,1,"lines","all");
        favourites.cook();
        System.out.println(favourites.texture);

        _021_Pho phoChay = new _021_Pho();
        System.out.println(phoChay.shape);
    }
}
