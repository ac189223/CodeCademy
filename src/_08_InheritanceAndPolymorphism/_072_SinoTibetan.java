package _08_InheritanceAndPolymorphism;

public class _072_SinoTibetan extends _070_Language {

    _072_SinoTibetan(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}
