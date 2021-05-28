package ua.com.hillel.lesson2;

import java.util.ArrayList;

public class FirstMeetingInString implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        String[] wordsFromSentence = sentence.split(" ");
        int index = 0;
        for (int i = 0; i < wordsFromSentence.length; i++) {
            if(wordsFromSentence[i].equals(word)){
                index = i;
                break;
            }
        }
        return index;
    }
}


