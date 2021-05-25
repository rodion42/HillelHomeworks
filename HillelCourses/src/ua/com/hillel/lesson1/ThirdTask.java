package ua.com.hillel.lesson1;

public class ThirdTask {
    public void thirdTask() {

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            builder.append("(" + i + "); ");
        }
        System.out.println(builder);


    }
}
