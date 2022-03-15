package com.basics.java.javaoreilly.controlstatements;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade;
        System.out.println("Enter a grade");
        grade = in.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You can do better.");
                break;
            case 'D':
                System.out.println("You are close to fail");
                break;
            case 'F':
                System.out.println("you are failed.");
                break;
            default:
                System.out.println("You have entered invalid grade");
        }
    }
}
