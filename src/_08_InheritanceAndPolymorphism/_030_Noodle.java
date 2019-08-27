package _08_InheritanceAndPolymorphism;

public class _030_Noodle {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    private String texture = "brittle";

    _030_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    final public boolean isTasty() {
        return true;
    }

    public static void main(String[] args) {
        _031_Ramen yasaiRamen = new _031_Ramen();
        System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());
    }

}
