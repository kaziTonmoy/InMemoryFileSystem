package com.memoryFileSystem;

import java.io.File;

public class FileDetails {

    public FileDetails(String givenDir) {

        fileDetailsTracker(givenDir);
    }
    public  FileDetails(String givenDir,String fileName){
        String fileDetailsPath = givenDir+fileName;
        fileDetailsTracker(fileDetailsPath
        );
    }

    public void fileDetailsTracker(String filePath){
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("The file has "+file.length()+" bytes.");
            if (file.canRead()&&file.canWrite()){
                System.out.println("The file is readable and writable");
            }
            System.out.println("The absolute path is "+file.getAbsolutePath());
            System.out.println("Last modified on "+ new java.util.Date(file.lastModified()));
        }else{
            System.out.println("File is not located in given location .");
        }
    }

}
