package _08_InheritanceAndPolymorphism;

public class _070_Language {
    protected static String name;
    protected static int numSpeakers;
    protected static String regionsSpoken;
    protected static String wordOrder;

    _070_Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        _070_Language spanish = new _070_Language("Spanish", 8000000, "South America", "random");
        spanish.getInfo();

        _071_Mayan mayanWest = new _071_Mayan("Mayanilian", 6574);
        mayanWest.getInfo();

        _071_Mayan kiche = new _071_Mayan("Ki'che'", 2330000);
        kiche.getInfo();

        _072_SinoTibetan mandarinChinese = new _072_SinoTibetan("Mandarin Chinese", 910000000);
        mandarinChinese.getInfo();

        _072_SinoTibetan burmese = new _072_SinoTibetan("Burmese", 33000000);
        burmese.getInfo();
    }
}
