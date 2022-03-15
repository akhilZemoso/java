package com.basics.java.javaoreilly.introduction;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        //e.g., Binary Operators
        int addition = a+b;
        int difference = a-b;
        int product = a*b;
        int quotient = b/a;
        int remainder = b%a;
        System.out.println("sum is "+addition);
        System.out.println("diff is "+difference);
        System.out.println("product is "+product);
        System.out.println("quotient is "+quotient);
        System.out.println("remainder is "+remainder);
        addition+=20; //addition = addition+20;
        System.out.println("addition is now "+addition);
        //e.g., Unary Operators
        addition++; //++addition
        System.out.println("addition++ "+addition);
        addition--; //--addition
        System.out.println("addition-- "+addition);
        product*=2; // product = product*2;
        System.out.println("final value of product is "+product);
    }
}
