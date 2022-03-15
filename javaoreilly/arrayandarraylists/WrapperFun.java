package com.basics.java.javaoreilly.arrayandarraylists;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();
        myAL.add(10);
        myAL.add(22);
        for(int i=0;i<myAL.size();i++){
            System.out.println(myAL.get(i));
        }
        String someVal = "450";
        int numericValue = Integer.parseInt(someVal);
        numericValue+=10;
        System.out.println(numericValue);
        String strPi = "3.14159";
        double myPi = Double.parseDouble(strPi);
        myPi+=2.5;
        System.out.println(myPi);
    }
}
