package com.basics.java.javaoreilly.controlstatements;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number=in.nextInt();
        if(number%3==0){
            System.out.println(number+" is divisible by 3.");
        }
        else {
            System.out.println(number+" is not divisible by 3.");
        }
    }

}
