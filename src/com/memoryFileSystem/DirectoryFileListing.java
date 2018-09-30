package com.memoryFileSystem;
import java.util.Scanner;
import java.io.File;

public class DirectoryFileListing {
    public DirectoryFileListing(String givenDir) {
        //givenDir = File.isDirectory();
        File f = new File(givenDir);
        if(f.isDirectory()){
            File[] listRoots = f.listFiles();
            for (File file: listRoots){
                System.out.println(file.getPath());
            }
        }

    }
}
