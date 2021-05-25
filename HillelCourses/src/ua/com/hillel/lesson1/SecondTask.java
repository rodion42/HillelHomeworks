package ua.com.hillel.lesson1;

public class SecondTask {
    public static void main(String[] args) {
        int[] numbersFrom10to20 = new int[10];
        double average = 0;
        double sum = 0;
        for (int i = 0; i < numbersFrom10to20.length; i++) {
            numbersFrom10to20[i] = (int) Math.round((Math.random() * 9) + 11);
            System.out.println(numbersFrom10to20[i]);
            sum += numbersFrom10to20[i];
        }
        average = sum / numbersFrom10to20.length;
        System.out.println(average);
    }
}
