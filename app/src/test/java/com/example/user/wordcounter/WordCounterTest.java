package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounterTest {

    WordCounter sentence;
    WordCounter sentence2;


    @Before
    public void before() {
        sentence = new WordCounter("How many words in this string");
        sentence2 = new WordCounter("If you spend too much time thinking about a thing, you'll never get it done.");
    }

    @Test
    public void wordCounterHasSentence() {
        assertEquals("How many words in this string", sentence.getSentence());
    }

    @Test
    public void canSetSentence() {
        sentence.setSentence("another sentence");
        assertEquals("another sentence", sentence.getSentence());
    }

    @Test
    public void canCountWords() {
        assertEquals(6,sentence.countWords(sentence.getSentence()));
        assertEquals(15,sentence2.countWords(sentence2.getSentence()));
    }

}
