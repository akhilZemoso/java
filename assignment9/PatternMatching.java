/*
Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.

 */
package com.basics.java.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("Enter the sentence or string : ");
        input=in.nextLine();
        Pattern p = Pattern.compile("^[A-Z].*\\.$");
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        if(b){
            System.out.println("Follows the given pattern.");
        }
        else {
            System.out.println("Doesn't follows the given pattern");
        }
        in.close();
    }
}
