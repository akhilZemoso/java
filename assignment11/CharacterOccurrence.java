/*
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters. Save the results in a text file.
 */
package com.basics.java.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccurrence {
    HashMap<Character,Integer> map = new HashMap<>();
    public void countEachCharacter(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
    }

    public static void main(String[] args) {
        CharacterOccurrence characterOccurrence = new CharacterOccurrence();
        Scanner infile;
        try {
            infile = new Scanner(new File(args[0]));
            while (infile.hasNext()){
                characterOccurrence.countEachCharacter(infile.nextLine());
            }
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        try {
            PrintWriter pw = new PrintWriter("output11.txt");
            for (Character c : characterOccurrence.map.keySet()){
                pw.println(c+"->"+characterOccurrence.map.get(c));
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
}
