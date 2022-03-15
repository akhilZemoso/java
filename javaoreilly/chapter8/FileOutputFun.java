package com.basics.java.javaoreilly.chapter8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello there!");
            pw.println("My name is John Baugh.");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
    }
}
