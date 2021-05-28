package ua.com.hillel.lesson2;

public class CountRepetition implements StringWorker{
    @Override
    public int execute(String sentence, String word) {
        int counter = 0;
        String[] wordsFromSentence = sentence.split(" ");
        for (int i = 0; i < wordsFromSentence.length; i++) {
            if(wordsFromSentence[i].equals(word)){
                counter++;
            }
        }
        return counter;
    }

}
