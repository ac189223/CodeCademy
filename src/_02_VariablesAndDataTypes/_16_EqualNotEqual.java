package _02_VariablesAndDataTypes;

public class _16_EqualNotEqual {
    public static void main(String[] args) {
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        System.out.println(sameNumberOfSongs);
        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println(differentLength);
    }
}
