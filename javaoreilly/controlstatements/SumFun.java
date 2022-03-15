package com.basics.java.javaoreilly.controlstatements;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.println("Enter non-negative to add to sum");
        System.out.println("Enter a negative to exit!");
        input = in.nextInt();
        while (input>=0){
            sum+=input;
            System.out.println("Enter non-negative to add to sum");
            System.out.println("Enter a negative to exit!");
            input = in.nextInt();
        }
        System.out.println("Sum is : "+sum);
    }
}
