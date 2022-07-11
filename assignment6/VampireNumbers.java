/*
     A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.
 */
package com.basics.java.assignment6;

import java.util.ArrayList;

public class VampireNumbers {
    public static void printVampireNumbers(int quantity){
        int count=0;
        int num=1;
        while(count<quantity){
            //checks if the number is vampire number
            if(isVampireNumber(num)){
                System.out.println(num);
                count++;
            }
            //increments number
            num++;
        }
    }

    public static boolean isVampireNumber(int num){
        //checks whether the number has even number of digits  or not
        if(hasEvenNumberOfDigits(num)){
            //counts the number of digits
            int length=countDigits(num);
            ArrayList<String> permutations=new ArrayList<>();
            //finds the permutations of the number
            StringPermutations(Integer.toString(num), "", permutations);
            String num1,num2;
            for(String str:permutations) {
                //takes two permutations
                num1=str.substring(0, length/2);
                num2=str.substring(length/2);
                //checks if both the numbers(permutations) has trailing zeros or having leading zeros
                if(!((hasLeadingZeros(num1) || hasLeadingZeros(num2)) || (hasTrailingZeros(num1) && hasTrailingZeros(num2))))
                {
                    //checks whether their product gives the original number
                    if(Integer.parseInt(num1)*Integer.parseInt(num2)==num)
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean hasEvenNumberOfDigits(int n){
        int count=countDigits(n);
        if(count>2 && count%2==0)
            return true;
        return false;
    }

    public static int countDigits(int n){
        int count=0;
        for(int i=n;i>0;i=i/10){
            count++;
        }
        return count;
    }

    public static boolean hasTrailingZeros(String num){
        if(Integer.parseInt(num)%10=='0')
            return true;
        return false;
    }

    public static boolean hasLeadingZeros(String num){
        if(num.charAt(0)=='0')
            return true;
        return false;
    }

    public static void StringPermutations(String num, String ans, ArrayList<String> res){
        if(num.length()==0){
            res.add(ans);
            return;
        }
        //finding the permutations
        boolean digit[] = new boolean[10];
        for(int i=0;i<num.length();i++){
            char target=num.charAt(i);
            //Till the length of the required permutation adds the number to array list
            String str = num.substring(0, i) + num.substring(i + 1);
            if(digit[target-'0']==false) {
                StringPermutations(str, ans+target, res);
            }
            digit[target-'0']=true;
        }
    }

    public static void main(String[] args) {
        printVampireNumbers(100);
    }
}
