package com.basics.java.javaoreilly.introduction;

import java.util.Scanner;

public class Proj2_1_AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double average;
        System.out.println("Enter the three numbers : ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        in.nextLine(); //good habit
        average = (num1+num2+num3)/3.0;
        System.out.println("The average of three numbers is : "+average);
    }
}
