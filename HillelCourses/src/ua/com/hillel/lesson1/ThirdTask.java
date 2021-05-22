package ua.com.hillel.lesson1;

public class ThirdTask {
    public void  thirdTask(){
        String s1 = "";

        for (int i = 1; i < 31; i++) {
            if(i == 30){
                String s2 = s1 + "(" + String.valueOf(i) + ")";
                System.out.print(s2);
                break;
            }
            String s2 = s1 + "(" + String.valueOf(i) + "), ";
            System.out.print(s2);
        }

    }
}
