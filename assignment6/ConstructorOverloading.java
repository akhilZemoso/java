/*
2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */
package com.basics.java.assignment6;

public class ConstructorOverloading {
    private String str;
    public ConstructorOverloading(){
        //initializing the variable
        this.str="This is Default Constructor\n";
    }
    public ConstructorOverloading(String s){
        //calling the default constructor
        this();
        str=str+s;
        System.out.println(str);
    }
    public static void main(String args[]){
        ConstructorOverloading obj = new ConstructorOverloading("This is Parameterized constructor");
    }
}
