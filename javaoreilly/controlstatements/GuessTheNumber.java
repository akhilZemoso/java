package com.basics.java.javaoreilly.controlstatements;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ourGuess;
        int computerNumber;
        int guessCount=0;
        Random random = new Random();
        computerNumber = random.nextInt(100)+1;
        boolean guessed = false;
        while (!guessed){
            System.out.println("Enter your guess : ");
            ourGuess = in.nextInt();
            guessCount++;
            if(ourGuess>=1 && ourGuess<=100)
            {
                if(computerNumber==ourGuess){
                    guessed = true;
                    System.out.println("Congratulations! you have guessed the number in "+guessCount+" guesses! Thanks for playing.");
                }
                else if(ourGuess>computerNumber){
                    System.out.println("Your guess is too high!");
                }
                else
                {
                    System.out.println("Your guess is too low!");
                }
            }
            else
            {
                System.out.println("Wasted guess");
            }
        }
    }
}
