package com.basics.java.javaoreilly.arrayandarraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();
        System.out.println("Enter 0 or more to put in list or enter -1 to exit.");
        double input = in.nextDouble();
        while (input>=0){
            myList.add(input);
            System.out.println("Enter 0 or more to put in list or enter -1 to exit.");
            input = in.nextDouble();
        }
        for(int i= myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
}
