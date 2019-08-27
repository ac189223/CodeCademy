package _08_InheritanceAndPolymorphism;

public class _061_Spaghetti extends _060_Noodle {

    _061_Spaghetti() {
        super(30.0, 0.2, "round", "semolina flour");
    }

    @Override
    public String getCookPrep() {
        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
    }
}
