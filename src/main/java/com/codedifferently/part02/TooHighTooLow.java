package com.codedifferently.part02;
import java.util.Random;
import java.util.Scanner;
public class TooHighTooLow {

    public static void main(String[] args) {
                int guessNum = 1;
        Random rand=new Random();
        int mysteryNum = rand.nextInt(10)+1;
       	Scanner scanner = new Scanner(System.in);
        int guess=0;
        do{
        System.out.println("Pick a number from 1 to 10");
        guess = scanner.nextInt();
        if(guess == mysteryNum) {
            System.out.println("Winner, Winner, Chicken Dinner!  You guessed "+ guess + " in "+ guessNum + " guesses.");
            }
        else if(guess<mysteryNum){
            System.out.println("Your guess of "+ guess + " is too low.  Try again.");
            guessNum++;
            }
        else{
            System.out.println("Your guess of " + guess + " is too high.  Try again.");
            guessNum++;
            }  
        } 
        while(guess != mysteryNum);
    }   
}      
