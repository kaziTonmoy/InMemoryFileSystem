package com.memoryFileSystem;

import java.io.File;

public class CreateDirectory {

    public CreateDirectory(String givenDir) {
        File dir = new File(givenDir);
        if(checkDir(givenDir)){
            dir.mkdir();

            String dirPath = dir.getPath();
            System.out.println("Directory Created ::: "+dirPath);
        }else {
            dir.mkdirs();

            String dirPath = dir.getPath();
            System.out.println("Directories Created ::: "+dirPath);
        }

    }

    public boolean checkDir(String givenDir){
        String parentPath = getParentDirPath(givenDir);
        File f = new File(parentPath);
        if (f.isDirectory()){
            return true;
        }else {
            return false;
        }

    }


    public static String getParentDirPath(String givenDir) {
        boolean endsWithSlash = givenDir.endsWith(File.separator);
        return givenDir.substring(0, givenDir.lastIndexOf(File.separatorChar,
                endsWithSlash ? givenDir.length() - 2 : givenDir.length() - 1));
    }
}
