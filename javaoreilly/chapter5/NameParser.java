package com.basics.java.javaoreilly.chapter5;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        System.out.println("Enter your full name : ");
        fullName = in.nextLine();
        int indexOfSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0,indexOfSpace);
        lastName = fullName.substring(indexOfSpace);
        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();
        System.out.println("First name is "+firstName);
        System.out.println("Last name is "+lastName);

    }
}
