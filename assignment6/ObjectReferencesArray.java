/*
Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
package com.basics.java.assignment6;

import java.util.Scanner;

public class ObjectReferencesArray {
    public ObjectReferencesArray(String str){
        //printing the entered string every time parameterized constructor called
        System.out.println("Entered string is : "+str);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //declaring object references array
        ObjectReferencesArray[] array=new ObjectReferencesArray[n];
        for(int i=0;i<n;i++){
            String input=in.next();
            //storing object references
            array[i]=new ObjectReferencesArray(input);
        }
        in.close();
    }
}
