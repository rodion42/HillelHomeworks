package ua.com.hillel.lesson1;

public class FirstTask {
    public void firstTask() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("Hello world, ");
            else if (i % 3 == 0)
                System.out.print("Hello, ");
            else if (i % 5 == 0) {
                if (i == 100) {
                    System.out.print("World.");
                } else {
                    System.out.print("World, ");
                }
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

    }
}

