package com.LickingHeights;

import java.util.Scanner;


public class HangMan {

    public static void main(String[] args) {


        Scanner keyboard;
        String secretword;
        String again;
        String player1;
        String player2;
        String letter;
        String[] guessbreakdown;

        keyboard = new Scanner(System.in);

            System.out.println("Welcome to the hangman game");
            System.out.println("The rules are simple, you have unlimited guesses, but you only have 11 mistakes");
            System.out.println("if you don't complete the secret phrase without messing up 11 times, yo mans gonna get hung");
            System.out.println("Player 1, pick a phrase for player 2 to guess");
            secretword = keyboard.nextLine();

        System.out.println("+------------------+");
        System.out.println("|        |         |");
        System.out.println("|        O         |");
        System.out.println("|       /|\\        |");
        System.out.println("|      / | \\       |");
        System.out.println("|       / \\        |");
        System.out.println("|      /   \\       |");
        System.out.println("+------------------+");

        //System.out.println(secretword);









    }
}
