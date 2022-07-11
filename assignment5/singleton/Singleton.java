package com.basics.java.assignment5.singleton;

public class Singleton {
    String nonStaticMemberVariable;
    public static Singleton initializeMemberVariable(String str){
        // we cannot initialize or access to the non static member variable inside the static method
        //this.nonStaticMemberVariable = str;
        return new Singleton();
    }
    public void printString(){
        System.out.println("String is : "+nonStaticMemberVariable);
    }
}
