package troweprice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceTest {

    private static final String SENTENCE = "The cow jumped over the moon.";

    @Test
    @DisplayName("when sentence is given then return the longest word")
    void getLongestWord() {
        Word word = new Sentence().getLongestWord(SENTENCE);

        assertEquals("jumped", word.getContent());
        assertEquals(6, word.getLength());
    }

    @Test
    @DisplayName("when sentence is empty then getLongestWord method will return empty string")
    void getLongestWordForAnEmptySentence() {
        Word word = new Sentence().getLongestWord("");

        assertEquals("", word.getContent());
        assertEquals(0, word.getLength());
    }

    @Test
    @DisplayName("when sentence contains multiple longest words then return the first one")
    void getFirstLongestWord() {
        Word word = new Sentence().getLongestWord(SENTENCE + " 123456");

        assertEquals("jumped", word.getContent());
        assertEquals(6, word.getLength());
    }

    @Test
    @DisplayName("when sentence is given then return the shortest word")
    void getShortestWord() {
        Word word = new Sentence().getShortestWord(SENTENCE);

        assertEquals("The", word.getContent());
        assertEquals(3, word.getLength());
    }

    @Test
    @DisplayName("when sentence is empty then getShortestWord method will return empty string")
    void getShortestWordForAnEmptySentence() {
        Word word = new Sentence().getShortestWord("");

        assertEquals("", word.getContent());
        assertEquals(0, word.getLength());
    }
}
