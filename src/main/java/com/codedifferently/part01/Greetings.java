package com.codedifferently.part01;
import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equalsIgnoreCase("hakim") || input.equalsIgnoreCase("Rasheeda")) {
            System.out.println("Hi " + input);
        }

    }
}
