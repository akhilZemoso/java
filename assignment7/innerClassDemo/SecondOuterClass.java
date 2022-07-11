package com.basics.java.assignment7.innerClassDemo;

public class SecondOuterClass extends FirstOuterClass{
    class SecondInnerClass extends FirstInnerClass{
        public SecondInnerClass(String str) {
            super(str);
            System.out.println("Second Inner class variable is : "+str);
        }
    }
}
