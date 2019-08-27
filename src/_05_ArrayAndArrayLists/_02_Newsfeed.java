package _05_ArrayAndArrayLists;

import java.util.Arrays;

public class _02_Newsfeed {

    public _02_Newsfeed(){

    }

    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }


    public static void main(String[] args){
        _02_Newsfeed sampleFeed = new _02_Newsfeed();
        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
        String stringTopics = Arrays.toString(topics);
        System.out.println(stringTopics);
    }
}
