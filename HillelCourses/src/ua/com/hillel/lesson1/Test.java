package ua.com.hillel.lesson1;

public class Test {
    public static void main(String[] args) {
                FirstTask test1 = new FirstTask();
                test1.firstTask();

                int[] array = new int[10];
                double average = 0;
                double sum = 0;
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) Math.round((Math.random() * 10) + 10);
                    System.out.println(array[i]);
                    sum+=array[i];
                }
                average = sum/array.length;
                System.out.println(average);

                ThirdTask test3 = new ThirdTask();
                test3.thirdTask();
            }
        }

