package com.basics.java.javaoreilly.controlstatements;

import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Pub and Grille.");
        System.out.println("Please enter your age :");
        age = in.nextInt();
        if(age>=21){
            System.out.println("Here, have a beer.");
        }
        else if(age>=16){
            System.out.println("Here have a coke!");
            System.out.println("Atleast you can drive");
        }
        else
        {
            System.out.println("Here have a coke!");
        }
    }
}
