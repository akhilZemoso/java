package com.basics.java.javaoreilly.chapter6;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(2,5));
        System.out.println(getResult(5,"10"));
        System.out.println(getResult("John","Baugh"));
    }
    public static int getResult(int num){
        return num*2;
    }
    public static int getResult(int num1,int num2){
        return num1*num2;
    }
    public static int getResult(int num1,String value){
        return num1*Integer.parseInt(value);
    }
    public static String getResult(String str1,String str2){
        return str1+" "+str2;
    }
}
