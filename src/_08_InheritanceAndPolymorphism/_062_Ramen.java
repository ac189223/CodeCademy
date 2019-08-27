package _08_InheritanceAndPolymorphism;

public class _062_Ramen extends _060_Noodle{

    _062_Ramen() {
        super(30.0, 0.3, "flat", "wheat flour");
    }

    @Override
    public String getCookPrep() {
        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
    }
}
