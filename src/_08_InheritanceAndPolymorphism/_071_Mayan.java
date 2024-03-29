package _08_InheritanceAndPolymorphism;

public class _071_Mayan extends _070_Language{

    _071_Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
        System.out.println("Fun fact: " + name + " is an ergative language.");
    }
}
