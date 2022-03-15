package com.basics.java.javaoreilly.chapter6;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(50);
        System.out.println(sumElements(list));
    }
    public static int sumElements(ArrayList<Integer> list){
        int sum =0;
        for (int num : list){
            sum+=num;
        }
        return sum;
    }
}
