/*
5. Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.
 */
package com.basics.java.assignment7.innerClassDemo;

public class Main {
    public static void main(String[] args) {
        FirstOuterClass firstOuterClass = new FirstOuterClass();
        FirstOuterClass.FirstInnerClass firstInnerClass = firstOuterClass.new FirstInnerClass("Hello");
        SecondOuterClass secondOuterClass = new SecondOuterClass();
        SecondOuterClass.SecondInnerClass secondInnerClass= secondOuterClass.new SecondInnerClass("Akhil");
    }
}
