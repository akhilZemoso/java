package com.basics.java.javaoreilly.chapter8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Samantha");
        names.add("John");
        names.add("Bob");
        names.add("Luke");
        names.add("Martin");
        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for(String name : names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
    }
}
