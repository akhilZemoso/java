package com.basics.java.assignment5.data;

public class Data {
    int num;
    char character;
    public void printVariables(){
        System.out.println("Num is : "+num);
        System.out.println("Character is : "+character);
    }
    //Printing Local variables without initialization
    /*public void printLocalVariablesWithoutInitialization(){
        int num1;
        char char1;
        //printing local variables without initialization gives error
        //local variables are not initialized with default values by declaration
        System.out.println("Num1 is : "+num1);
        System.out.println("Char1 is : "+char1);
    }*/
}
