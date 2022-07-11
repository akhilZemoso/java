package com.basics.java.assignment8;

import java.util.Scanner;

class ZeroException extends Exception{
    public ZeroException(String foundZero){
        super(foundZero);
    }
}
class NegativeNumberException extends Exception{
    public NegativeNumberException(String foundNegativeNumber){
        super(foundNegativeNumber);
    }
}
class OddNumberException extends Exception{
    public OddNumberException(String foundOddNumber){
        super(foundOddNumber);
    }
}
public class NewTypesOfExceptions {
    public static void checkException(int n){
        try {
            if(n==0) throw new ZeroException("Found Zero");
            else if(n%2!=0) throw new OddNumberException("Found Odd Number");
            else if(n<0) throw new NegativeNumberException("Found Negative number");
            else throw new NullPointerException();
        }
        catch (ZeroException | NegativeNumberException | OddNumberException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block!");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        checkException(n);
        in.close();
    }
}
