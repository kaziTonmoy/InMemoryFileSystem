package com.memoryFileSystem;

import java.io.File;

public class DeleteDirectory {
    public DeleteDirectory(String givenDir) {

        File file = new File(givenDir);

        if (file.exists()){
            String[] entries = file.list();
            for (String s : entries) {
                File currentFile = new File(file.getPath(), s);
                currentFile.delete();
            }

            file.delete();

            System.out.println("Done");
        }else {
            System.out.println("Not such given directory Exists !!!");
        }
    }
}
