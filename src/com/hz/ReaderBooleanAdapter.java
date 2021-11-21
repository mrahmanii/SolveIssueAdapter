package com.hz;

import java.util.Arrays;
import java.util.List;

public class ReaderBooleanAdapter {

    private List<String> possibleAnswers;

    public ReaderBooleanAdapter() {
        possibleAnswers = Arrays.asList("true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise");
    }

    public Boolean isTrue(String inputValue) {
        return possibleAnswers.contains(inputValue);
    }

}
