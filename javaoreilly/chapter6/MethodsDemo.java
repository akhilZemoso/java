package com.basics.java.javaoreilly.chapter6;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        System.out.println(giveMe10());
        System.out.println(sum(10,20));
        System.out.println(square(7.25));
    }
    //void , parameterless
    public static void printHello(){
        System.out.println("Hello there!");
    }

    //void, parameterized
    public static void printNumber(int a){
        System.out.println("THe number is "+a);
    }

    //value-returning, parameterless
    public static int giveMe10(){
        return 10;
    }
    //value-returning, parameterized
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static double square(double num){
        return num*num;
    }
}
