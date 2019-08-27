package _07_StringMethods;

public class _02_DNA {
    public static String isProtein(String dna) {
        int length = dna.length();
        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");
        if ((start == 0) && (stop == length - 3) && ((stop - start) % 3 == 0)) {
            return "";
        } else {
            return "not ";
        }
    }

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2= "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        System.out.println(dna1 + " is " + isProtein(dna1) + "a protein.");
        System.out.println(dna2 + " is " + isProtein(dna2) + "a protein.");
        System.out.println(dna3 + " is " + isProtein(dna3) + "a protein.");
    }
}
