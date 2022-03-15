package com.basics.java.javaoreilly.chapter6;

public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);
        countUpTo(1,5);
    }
    public static void countDownFrom(int num){
        if(num>=0){
            System.out.println(num);
            countDownFrom(num-1);
        }
    }
    public static void countUpTo(int from,int to){
        if(from<=to){
            System.out.println(from);
            countUpTo(from+1,to);
        }
    }
}
