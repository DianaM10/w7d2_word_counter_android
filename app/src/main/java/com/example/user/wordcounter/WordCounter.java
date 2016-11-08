package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter {

    private String sentence;

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int itemCount = words.length;
        return itemCount;


    }



}
