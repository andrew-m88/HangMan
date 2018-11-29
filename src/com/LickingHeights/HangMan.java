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
        String[] currentGuessbreakdown;

        keyboard = new Scanner(System.in);

            System.out.println("Welcome to the hangman game");
            System.out.println("The rules are simple, you have unlimited guesses, but you only have 11 mistakes");
            System.out.println("if you don't complete the secret phrase without messing up 11 times, yo mans gonna get hung");

            System.out.println("Player 1, pick a phrase for player 2 to guess");
            secretword = keyboard.nextLine();
            System.out.println(hangman(0));


            //System.out.println(secretword);
            currentGuessbreakdown =  guessbreakdown(secretword);
            for(String tempWord: currentGuessbreakdown){

                for(int i=0;i<tempWord.length();i++){
                    System.out.print("-");
                }
                System.out.print(" ");
            }
            System.out.println("");
            System.out.println("Player 2 start guessing");
            letter = keyboard.nextLine();

    }
    public static  String[] guessbreakdown(String secretword){
        String[] guessbreakdown = secretword.split(" ");
        return guessbreakdown;

    }
    public static



    public static String hangman(int errors){
        String display ="";

        switch(errors){
            case 0:
                default:
                    display = "+------------------+\n"+
                              "|         |     11 |\n"+
                              "|                  |\n"+
                              "|                  |\n"+
                              "|                  |\n"+
                              "|                  |\n"+
                              "|                  |\n"+
                              "+------------------+\n";
                    break;
            case 1:
                display = "+------------------+\n"+
                          "|         |     10 |\n"+
                          "|         O        |\n"+
                          "|                  |\n"+
                          "|                  |\n"+
                          "|                  |\n"+
                          "|                  |\n"+
                          "+------------------+\n";
                break;
            case 2:
                display = "+------------------+\n"+
                          "|         |      9 |\n"+
                          "|         O        |\n"+
                          "|         |        |\n"+
                          "|                  |\n"+
                          "|                  |\n"+
                          "|                  |\n"+
                          "+------------------+\n";
                break;
            case 3:
                display = "+------------------+\n"+
                          "|         |      8 |\n"+
                          "|         O        |\n"+
                          "|         |        |\n"+
                          "|         |        |\n"+
                          "|                  |\n"+
                          "|                  |\n"+
                          "+------------------+\n";
                break;
            case 4:
                display = "+------------------+\n"+
                          "|         |      7 |\n"+
                          "|         O        |\n"+
                          "|         |        |\n"+
                          "|         |        |\n"+
                          "|        /         |\n"+
                          "|                  |\n"+
                          "+------------------+\n";
                break;
            case 5:
                display = "+------------------+\n"+
                          "|         |      6 |\n"+
                          "|         O        |\n"+
                          "|         |        |\n"+
                          "|         |        |\n"+
                          "|        / \\       |\n"+
                          "|                  |\n"+
                          "+------------------+\n";
                break;
            case 6:
                display = "+------------------+\n"+
                          "|         |      5 |\n"+
                          "|         O        |\n"+
                          "|         |        |\n"+
                          "|         |        |\n"+
                          "|        / \\       |\n"+
                          "|       /          |\n"+
                          "+------------------+\n";
                break;
            case 7:
                display = "+------------------+\n"+
                          "|         |      4 |\n"+
                          "|         O        |\n"+
                          "|         |        |\n"+
                          "|         |        |\n"+
                          "|        / \\       |\n"+
                          "|       /   \\      |\n"+
                          "+------------------+\n";
                break;
            case 8:
                display = "+------------------+\n"+
                          "|         |      3 |\n"+
                          "|         O        |\n"+
                          "|         |\\       |\n"+
                          "|         |        |\n"+
                          "|        / \\       |\n"+
                          "|       /   \\      |\n"+
                          "+------------------+\n";
                break;
            case 9:
                display = "+------------------+\n"+
                          "|         |      2 |\n"+
                          "|         O        |\n"+
                          "|         |\\       |\n"+
                          "|         | \\      |\n"+
                          "|        / \\       |\n"+
                          "|       /   \\      |\n"+
                          "+------------------+\n";
                break;
            case 10:
                display = "+------------------+\n"+
                          "|         |      1 |\n"+
                          "|         O        |\n"+
                          "|        /|\\       |\n"+
                          "|         | \\      |\n"+
                          "|        / \\       |\n"+
                          "|       /   \\      |\n"+
                          "+------------------+\n";
                break;
            case 11:
                display = "+------------------+\n"+
                          "|         |   dead |\n"+
                          "|         O        |\n"+
                          "|        /|\\       |\n"+
                          "|       / | \\      |\n"+
                          "|        / \\       |\n"+
                          "|       /   \\      |\n"+
                          "+------------------+\n";
                break;
        }
        return display;
    }
}

