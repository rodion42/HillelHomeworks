package ua.com.hillel.lesson1;

public class FirstTask {
    public void firstTask(){
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0 && (i % 5 != 0)){
                System.out.print("Hello, ");
                continue;
            }
            if((i % 5 == 0) && (i % 3 == 0)){
                System.out.print("Hello World, ");
                continue;
            }
            if(i % 5 == 0){
                if(i == 100){
                    System.out.print("World");
                    break;
                }
                System.out.print("World, ");
                continue;
            }

            System.out.print(i + ", ");


        }
    }
}
