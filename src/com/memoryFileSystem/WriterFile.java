package com.memoryFileSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterFile {
    public WriterFile(String givenDir) {
        fileWriter(givenDir);
    }
    public  WriterFile(String givenDir,String fileName){
        String filePath = givenDir+fileName;
        fileWriter(filePath);
    }

    public void fileWriter(String filePath){
        Writer writer;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your text in below :::");
        String text = scr.nextLine();

        try {
            writer = new FileWriter(filePath);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
