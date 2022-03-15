package com.basics.java.javaoreilly.chapter5;

public class StringMethods1 {
    public static void main(String[] args) {
        String name1 = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String challengeName = "Ed Mortram";
        if(name1.equals(name2)){
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names are not equal");
        }
        if(name1.compareTo(name3)>0){
            System.out.println("name1 > name3");
        }
        else {
            System.out.println("name1 <= name3");
        }
        System.out.println("Comparing for the lecture challenge");
        if(challengeName.compareTo(name1)>0){
            System.out.println(challengeName+" is greater than "+name1);
        }
        else {
            System.out.println(challengeName+" is less than or equal to "+name1);
        }

    }
}
