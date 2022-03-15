package com.basics.java.javaoreilly.arrayandarraylists;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter an integer : ");
            arr[i] = in.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("Result is "+(arr[i]*2));
        }
    }
}
