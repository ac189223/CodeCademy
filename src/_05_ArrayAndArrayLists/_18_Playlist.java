package _05_ArrayAndArrayLists;

import java.util.ArrayList;

public class _18_Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Kobong");
        desertIslandPlaylist.add("Massive Attack");
        desertIslandPlaylist.add("Lipali");
        desertIslandPlaylist.add("Marilyn Manson");
        desertIslandPlaylist.add("Fever Ray");
        desertIslandPlaylist.add("Skalpel");
        desertIslandPlaylist.add("Sugar Ray");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(0);
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        int a = desertIslandPlaylist.indexOf("Massive Attack");
        int b = desertIslandPlaylist.indexOf("Skalpel");
        String temp = desertIslandPlaylist.get(a);
        desertIslandPlaylist.set(a, desertIslandPlaylist.get(b));
        desertIslandPlaylist.set(b, temp);
        System.out.println(desertIslandPlaylist);
    }
}
