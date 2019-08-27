package _08_InheritanceAndPolymorphism;

public class _041_Spaetzle extends _040_Noodle {

    _041_Spaetzle() {
        super(3.0, 1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";
    }

    @Override
    public void cook() {
        System.out.println("Grinding or scraping dough.");
        System.out.println("Boiling.");
        this.texture = "cooked";
    }
}
