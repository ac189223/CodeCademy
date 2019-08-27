package _02_VariablesAndDataTypes;

public class _10_MadLibs {
/*
Program for making mad libbed stories by =-_-=
*/
 public static void main(String[] args){

     String name1 = "Turtle Sam";  // Main character
     String adjective1 = "nice";
     String adjective2 = "glad";
     String adjective3 = "hungry";
     String verb1 = "run";
     String noun1 = "cat";
     String noun2 = "hat";
     String noun3 = "flower";
     String noun4 = "bike";
     String noun5 = "foot";
     String noun6 = "man";
     String name2 = "Hedgehog Willy";  // Another character
     int number = 43;
     String place1 = "Space Ship Discovery";  // City, country or a planet

     //The template for the story
     String story = "This morning " + name1 + " woke up feeling " + adjective1 +
             ". \n 'It is going to be a " + adjective2 + " day!' \nOutside, a bunch of " + noun1 +
             "s were protesting to keep " + noun2 + " in stores. \nThey began to " + verb1 +
             " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 +
             ". \nConcerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 +
             " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". \n" + name1 +
             " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";
     System.out.println(story);
    }
}
