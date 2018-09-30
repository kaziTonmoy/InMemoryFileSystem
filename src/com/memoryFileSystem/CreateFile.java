package com.memoryFileSystem;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public CreateFile(String givenDir , String fileName) {
        File file = new File(givenDir,fileName);
        if (file.exists()){
            System.out.println("Same File name exists in given Directory .");

            System.out.println("Files of given Directory :::");
            new DirectoryFileListing(givenDir);
        }else {
            try{
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Files of given Directory after update :::");
            new DirectoryFileListing(givenDir);
        }
    }
    public CreateFile(String givenDir ) {
        File file = new File(givenDir);
        if (file.exists()){
            System.out.println("Same File name exists in given Directory .");

            System.out.println("Files of given Directory :::");
            new DirectoryFileListing(givenDir);
        }else {
            try{
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File Created :::");
            //new DirectoryFileListing(givenDir);

        }
    }
}
