package com.memoryFileSystem;

import java.io.File;
import java.io.Reader;
import java.util.Scanner;

public  class DirectoryFileManagement {
    Scanner scr = new Scanner(System.in);
    public DirectoryFileManagement() {

        boolean run = true;
        while (run){
            //Scanner scr = new Scanner(System.in);
            System.out.println(":::In Memory File System:::\n " +
                    "[ To Create File, Enter 1 ]\t [To Delete File,  Enter 2]\n" +
                    "[ To Create Directory, Enter 3 ]\t [To Delete Directory, Enter 4 ]\n" +
                    "[To check Diretories , Enter 5  ]\t [To Check File Details, Enter  6] \n" +
                    "[To Read File, Enter 7  ]\t [To Write File, Enter 8 ]");

            int num = scr.nextInt();
            if(num==1){
                /*Create File*/
                int dirType = askForDir();
                if(dirType==1){
                    Scanner scrD = new Scanner(System.in);
                    System.out.println("Enter Directory path for file creation :::");
                    String dirPath = scrD.nextLine()+File.separator;

                    Scanner scrF = new Scanner(System.in);
                    System.out.println("Enter File name for file creation :::");
                    String fileName = scrF.nextLine();
                    new CreateFile(dirPath,fileName);
                }else {
                    System.out.println("Enter absolute path for file creation :::");
                    Scanner scrD = new Scanner(System.in);
                    String dirPath = scrD.nextLine()+File.separator;
                    new CreateFile(dirPath);
                }



            }else if(num == 2){
                /*Delete File*/
                int dirType = askForDir();

                //String fileName = fileName();
                if(dirType==1){
                    Scanner scrD = new Scanner(System.in);
                    System.out.println("Enter Directory path for Delete file :::");
                    String dirPath = scrD.nextLine()+File.separator;

                    Scanner scrF = new Scanner(System.in);
                    System.out.println("Enter File name for Delete:::");
                    String fileName = scrF.nextLine();
                    new DeleteFile(dirPath,fileName);
                }else {
                    System.out.println("Enter absolute path for File Delete:::");
                    Scanner scrD = new Scanner(System.in);
                    String dirPath = scrD.nextLine()+File.separator;
                    new DeleteFile(dirPath);
                }

            }else if (num==3){
                /*create Directory*/
                System.out.println("Enter Directory path to create Directory :::");
                Scanner scrD = new Scanner(System.in);
                String dirPath = scrD.nextLine()+File.separator;
                new CreateDirectory(dirPath);
            }else if(num==4){
                /*delete Directory*/
                System.out.println("Enter directory path to Delete Directory :::");
                Scanner scrD = new Scanner(System.in);
                String dirPath = scrD.nextLine()+File.separator;
                new DeleteDirectory(dirPath);
            }else if(num==5){
                /*directory File listing*/
                System.out.println("Enter Directory path to see all available file in Directory :::");
                Scanner scrD = new Scanner(System.in);
                String dirPath = scrD.nextLine()+File.separator;
                new DirectoryFileListing(dirPath);
            }else if (num==6){
                /*file Details*/
                int dirType = askForDir();

                //String fileName = fileName();
                if(dirType==1){
                    Scanner scrD = new Scanner(System.in);
                    System.out.println("Enter Directory path to check File details:::");
                    String dirPath = scrD.nextLine()+File.separator;

                    Scanner scrF = new Scanner(System.in);
                    System.out.println("Enter File name :::");
                    String fileName = scrF.nextLine();
                    new FileDetails(dirPath,fileName);
                }else {
                    System.out.println("Enter absolute path to check file details:::");
                    Scanner scrD = new Scanner(System.in);
                    String dirPath = scrD.nextLine()+File.separator;
                    new FileDetails(dirPath);
                }
            }else if (num==7){
                /*read File*/
                int dirType = askForDir();

                //String fileName = fileName();
                if(dirType==1){
                    Scanner scrD = new Scanner(System.in);
                    System.out.println("Enter Directory path to read file :::");
                    String dirPath = scrD.nextLine()+File.separator;

                    Scanner scrF = new Scanner(System.in);
                    System.out.println("Enter File name :::");
                    String fileName = scrF.nextLine();
                    new ReaderFile(dirPath,fileName);
                }else {
                    System.out.println("Enter absolute path to read file :::");
                    Scanner scrD = new Scanner(System.in);
                    String dirPath = scrD.nextLine()+File.separator;
                    new ReaderFile(dirPath);
                }
            }else if (num==8){
                /*Write File*/
                int dirType = askForDir();

                //String fileName = fileName();
                if(dirType==1){
                    Scanner scrD = new Scanner(System.in);
                    System.out.println("Enter Directory path to write file :::");
                    String dirPath = scrD.nextLine()+File.separator;

                    Scanner scrF = new Scanner(System.in);
                    System.out.println("Enter File name :::");
                    String fileName = scrF.nextLine();
                    new WriterFile(dirPath,fileName);
                }else {
                    System.out.println("Enter absolute path to write file :::");
                    Scanner scrD = new Scanner(System.in);
                    String dirPath = scrD.nextLine()+File.separator;
                    new WriterFile(dirPath);
                }
            }

            System.out.println("For reload Main menu Enter 1 ,,, for Exit Enter 2 :::");
            int menuReload = scr.nextInt();
            if (menuReload==1){
                run=true;
            }else {
                run = false;
            }


        }
    }
    public int askForDir(){
        System.out.println("If you want to provide relative path,and file name separately Enter 1");
        System.out.println("If you want to provide absolute path , Enter 2 ");
        int pathChoice = scr.nextInt();
        if (pathChoice==1){
            return 1;
        }else if (pathChoice==2){
            return 2;
        }else {
            return 0;
        }
    }

public String pathMaintenance(int askDirType){
        if (askDirType==1){
             System.out.println("Enter Directory path :::");
             String dirPath = scr.nextLine()+File.separator;
             //fileName();
             return dirPath;
        }else if (askDirType==2){
            System.out.println("Enter Relative path :::");
            String dirPath = scr.nextLine()+File.separator;
            return dirPath;
        }else {
            System.out.println("invalid input");
            return "Err";
        }
    }
    public String fileName(){
        System.out.println("Enter File name :::");
        String fileName = scr.nextLine();
        return fileName;
    }

}

