package com.basics.java.assignment2;

import java.util.HashMap;
import java.util.Scanner;

public class CheckAlphabetsInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Please enter the string to check whether all alphabets are present or not");
        str=in.nextLine().toLowerCase();
        if(checkStringContainsAllAlphabets(str)){
            System.out.println("String contains all the letters");
        }
        else {
            System.out.println("String does not contain all the letters");
        }

    }
    public static boolean checkStringContainsAllAlphabets(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>=97 && c<=122){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
                else {
                    map.put(c,1);
                }
            }
        }
        if(map.size()==26){
            return true;
        }
        return false;
    }
}