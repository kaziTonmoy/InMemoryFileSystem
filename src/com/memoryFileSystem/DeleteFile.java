package com.memoryFileSystem;

import java.io.File;

public class DeleteFile {

    public DeleteFile(String givenDir, String fileName) {
        File file = new File(givenDir+fileName);

        if(file.delete())
        {
            System.out.println("File deleted successfully");
            System.out.println("Files of given Directory :::");
            new DirectoryFileListing(givenDir);
        }
        else
        {
            System.out.println("Failed to delete the file");
            System.out.println("Files of given Directory :::");
            new DirectoryFileListing(givenDir);
        }
    }

    public DeleteFile(String givenDir) {
        File file = new File(givenDir);

        if(file.delete())
        {
            System.out.println("File deleted successfully");
            System.out.println("Files of given Directory :::");
            new DirectoryFileListing(givenDir);
        }
        else
        {
            System.out.println("Failed to delete the file");
            System.out.println("Files of given Directory :::");
            new DirectoryFileListing(givenDir);
        }
    }
}
