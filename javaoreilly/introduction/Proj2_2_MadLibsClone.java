package com.basics.java.javaoreilly.introduction;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;
        System.out.print("Enter an adjective : ");
        adjective1 = in.nextLine();
        System.out.print("Enter a girls name : ");
        girlsName = in.nextLine();
        System.out.print("Enter another adjective : ");
        adjective2 = in.nextLine();
        System.out.print("Enter an occupation : ");
        occupation1 = in.nextLine();
        System.out.print("Enter the name of the place : ");
        placeName = in.nextLine();
        System.out.print("Enter the name of a piece of clothing : ");
        clothing = in.nextLine();
        System.out.print("Enter the name of the hobby : ");
        hobby = in.nextLine();
        System.out.print("Enter another adjective : ");
        adjective3 = in.nextLine();
        System.out.print("Enter another occupation : ");
        occupation2 = in.nextLine();
        System.out.print("Enter a boys name : ");
        boysName = in.nextLine();
        System.out.print("Enter a mans name : ");
        mansName = in.nextLine();
        System.out.println("There once was a "+adjective1+" girl named "+girlsName+" who was a "+adjective2+" "
        +occupation1+" in the kingdom of "+placeName+".");
        System.out.println("She loved to wear "+clothing+" and to "+hobby+". She wanted to marry "+adjective3+" "
        +occupation2+" named "+boysName+" but her father, King "+mansName+" forbid her seeing him.");
    }
}
