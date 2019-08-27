package _05_ArrayAndArrayLists;

import java.util.Arrays;

public class _03_Newsfeed {
    String[] topics;

    public _03_Newsfeed(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        _03_Newsfeed feed;
        if (args[0].equals("Human")) {

            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new _03_Newsfeed(humanTopics);

        } else if(args[0].equals("Robot")) {

            //topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new _03_Newsfeed(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new _03_Newsfeed(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
