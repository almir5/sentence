package troweprice;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Sentence {

    public Word getLongestWord(String sentence) {
        BinaryOperator<String> longestString = (a, b) -> b.length() > a.length() ? b : a;
        return getWord(sentence, longestString);
    }

    public Word getShortestWord(String sentence) {
        BinaryOperator<String> shortestString = (a, b) -> b.length() < a.length() ? b : a;
        return getWord(sentence, shortestString);
    }

    private Word getWord(String sentence, BinaryOperator<String> operator) {
        String filteredWord = Stream
            .of(sentence.split("(\\s)"))
            .reduce(operator)
            .orElse("");
        return new Word(filteredWord);
    }
}
