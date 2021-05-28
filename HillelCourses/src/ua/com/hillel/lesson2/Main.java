package ua.com.hillel.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sentence1 = new Scanner(System.in);
        System.out.print("Input hole sentence: ");
        String sentence = sentence1.nextLine();

        Scanner word1 = new Scanner(System.in);
        System.out.print("Input word : ");
        String word = word1.nextLine();

        Scanner enterIndex = new Scanner(System.in);
        System.out.print("If you want to see index of word type: showWordIndex ");
        String index = enterIndex.nextLine();

        Scanner enterRepetition = new Scanner(System.in);
        System.out.print("If you want to see index of word type: showWordRepetitions ");
        String repetitions = enterRepetition.nextLine();

        Scanner enterNumberOfCharsWithoutWords = new Scanner(System.in);
        System.out.print("If you want to see number of chars without repeating sentences type: showNumberOfCharsWithoutWords ");
        String numberOfChars = enterNumberOfCharsWithoutWords.nextLine();

        Scanner enterWhereYouWantToSeeInformation = new Scanner(System.in);
        System.out.println("Enter where you want to see information: file or console");
        String placeForInformation = enterWhereYouWantToSeeInformation.nextLine();

        StringBuilder output = new StringBuilder();
        if (index.equals("showWordIndex")) {
            FirstMeetingInString firstMeetingInString = new FirstMeetingInString();
            output.append("Index is: " + firstMeetingInString.execute(sentence, word) + ";");
            if (repetitions.equals("showWordRepetitions")) {
                CountRepetition countRepetition = new CountRepetition();
                output.append("Number of repetitions is: " + countRepetition.execute(sentence, word) + "; ");
                if (numberOfChars.equals("showNumberOfCharsWithoutWords")) {
                    NumberOfCharsWithoutWords numberOfCharsWithoutWords = new NumberOfCharsWithoutWords();
                    output.append("Number of chars is: " + numberOfCharsWithoutWords.execute(sentence, word) + ". ");
                }
            }
        }

//        if (repetitions.equals("showWordRepetitions")) {
//            CountRepetition countRepetition = new CountRepetition();
//            output.append("Number of repetitions is: " + countRepetition.execute(sentence, word) + "; ");
//        }
//
//        if (numberOfChars.equals("showNumberOfCharsWithoutWords")) {
//            NumberOfCharsWithoutWords numberOfCharsWithoutWords = new NumberOfCharsWithoutWords();
//            output.append("Number of chars is: " + numberOfCharsWithoutWords.execute(sentence, word) + ". ");
//        }

        if (placeForInformation.equals("file")) {
            MyFileWriter printInFile = new MyFileWriter();
            printInFile.write(output);
        }
        else if (placeForInformation.equals("console")){
            ConsoleWriter printInConsole = new ConsoleWriter();
            printInConsole.write(output);
        }
        else{
            System.out.println("You typed variants incorrectly.");
        }


    }
}
