/*
    Create a java program to search through the home directory and look for files that match a regular expression.
    The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
 */
package com.basics.java.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileAbsolutePath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File homeDirectory = new File(System.getProperty("user.home"));
        String regex;
        int count=0;
        while (true){
            System.out.println("Enter a regular expression to search files or enter -1 to quit!");
            regex = in.nextLine();
            if(regex.equals("-1")){
                break;
            }
            count+=findFile(regex,homeDirectory);
        }
        if(count==0){
            System.out.println("File not found!");
        }
        in.close();
    }
    public static int findFile(String regex,File file){
        int count = 0;

        for(File files : file.listFiles()){
            if(files.isDirectory()){
                count+=findFile(regex,files);
            }
            else if(files.isFile()) {
                if (Pattern.matches(regex, files.getName())) {
                    System.out.println(files.getAbsolutePath());
                    count += 1;
                }
            }
        }
        return count;
    }
}
