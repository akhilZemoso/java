package com.basics.java.javaoreilly.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numsFile;
        PrintWriter pw;
        try {
            numsFile = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");
            while (numsFile.hasNext()){
                pw.println(numsFile.nextInt()*2);
            }
            pw.close();
            numsFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File Not Found!");
        }
    }
}
