package com.basics.java.javaoreilly.introduction;

public class ConversionFun {
    public static void main(String[] args) {
        double myDouble = 3.14;
        float myFloat = 3.14f;   //narrowing/lossy conversion
        double yourDouble = myFloat; //widening/lossless conversion
    }
}
