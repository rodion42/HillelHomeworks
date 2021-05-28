package ua.com.hillel.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfCharsWithoutWords implements StringWorker{
    @Override
    public int execute(String sentence, String word) {
        String[] wordsFromSentence = sentence.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(wordsFromSentence));
        int numberOfCharsWithoutWords = 0;
        for (int i = 0; i < wordsFromSentence.length; i++) {
            if(wordsFromSentence[i].equals(word)){
                list.remove(word);
            }
        }
        wordsFromSentence = list.toArray(new String[list.size()]);

        for (int i = 0; i < wordsFromSentence.length; i++) {
            numberOfCharsWithoutWords += wordsFromSentence[i].length();
        }
        return numberOfCharsWithoutWords;
    }
}
