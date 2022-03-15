package com.basics.java.javaoreilly.chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;
        final int NUM_NAMES = 5;
        for(int i=0;i<NUM_NAMES;i++){
            System.out.println("Please enter name "+i+" : ");
            fullName = in.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0,indexOfSpace);
            lastName = fullName.substring(indexOfSpace+1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i=0;i<NUM_NAMES;i++){
            for(int j=0;j<NUM_NAMES;j++){
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }
    }
}
