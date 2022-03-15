package com.basics.java.javaoreilly.arrayandarraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Enter the name : ");
            names.add(in.nextLine());
            System.out.print("Enter the age : ");
            ages.add(in.nextInt());
            in.nextLine();
        }
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old.");
        }
    }
}
