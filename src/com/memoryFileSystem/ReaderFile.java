
package com.memoryFileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFile {
    public ReaderFile(String givenDir){
        fileRead(givenDir);
    }

    public ReaderFile(String givenDir,String fileName){
        String filePath = givenDir+fileName;
        fileRead(filePath);
    }


    public void fileRead(String filePath)  {
        File f=new File(filePath);
        Scanner scr = null;
        try {
            scr = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(f.exists())
        {
            while (scr.hasNextLine())
                System.out.println(scr.nextLine());
        }else
            System.out.println("No file to read");
    }
}
