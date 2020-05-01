//This file is obselete, please refer to python code
//import java.util.*;
import java.io.*;

public class body {

    public void interrogateDir(String dirString, String filename) {
        File folder = new File(dirString);
        File[] listOfFiles = folder.listFiles();
        for(int i = 0;i < listOfFiles.length;i++){
            //System.out.println(listOfFiles[i]);
        }
        //System.out.println(listOfFiles.length);

        /*for (int i = 0;i <= listOfFiles.length; i++) {
            String fileTemp = listOfFiles[i].getName().toString();
            if (listOfFiles[i].isFile() && fileTemp.equals(filename)) {
                System.out.println("Directory: \"" + listOfFiles[i].getParent() + "\" --- contains: \"" + filename + "\"");
                // break;
            } // if
            else if(listOfFiles[i].isDirectory()){
                System.out.println("Directory"  + listOfFiles[i]  + " does not contain "
                + filename);
            }
        }// for*/
    }// listFiles

    public static void main(String[] args) {// main

        body obj = new body();
        String cmdLineArg = args[0];
        //System.out.println(cmdLineArg);
        // String cmdLineArg2 = args[1];
        // System.out.println("Command line argument is " + cmdLineArg);
        // System.out.println("Command line argument 2 is " + cmdLineArg2);
        String pathVar = System.getenv("PATH");
        //System.out.println(pathVar);
        System.out.println("The PATH variable is " + pathVar);
        String[] dirArray = pathVar.split(";");
        for (String eachDir : dirArray) {
            // System.out.println(eachDir);
            obj.interrogateDir(eachDir, cmdLineArg);
        } // foreach

    }// main
}// class