package ua.com.hillel.lesson2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public void write(StringBuilder value){
        File file = new File("C:/Users/user/Desktop/HWinfo.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(value.toString());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
