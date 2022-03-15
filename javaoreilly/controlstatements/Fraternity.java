package com.basics.java.javaoreilly.controlstatements;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        char gender;
        System.out.print("Enter your age : ");
        age = in.nextInt();
        System.out.print("Enter your gender : ");
        gender = in.next().charAt(0);
        if(age>=19 && gender=='M'){
            System.out.println("You can join the fraternity");
        }
        else {
            System.out.println("you cannot join the fraternity");
        }
    }
}
