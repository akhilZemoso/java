package com.basics.java.javaoreilly.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;
        try {
            namesFile = new Scanner(new File("student_names.txt"));
            agesFile = new Scanner(new File("student_ages.txt"));
            pw = new PrintWriter("names_ages.txt");
            while (namesFile.hasNext()){
                pw.println(namesFile.nextLine()+" is "+agesFile.nextInt()+" years old.");
            }
            pw.close();
            namesFile.close();
            agesFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
    }
}
