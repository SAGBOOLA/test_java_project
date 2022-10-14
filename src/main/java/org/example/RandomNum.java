package org.example;
import java.util.Scanner;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        int randomNumber, userGuess = 0, guesses = 0;
        final int MAX = 500;
        String playGame = "yes";
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        randomNumber = generator.nextInt(MAX) + 1;
            //Creating a flag to control the inner loop
            int correct = 0;
            //The loop to control the round.
            while (correct == 0){
                System.out.println("Please pick a number between 1 and 500:");
                userGuess = scan.nextInt();
                // high and low suggestion
                if (userGuess > randomNumber)
                    System.out.println("Number is too high, try something lower.");
                if (userGuess < randomNumber)
                    System.out.println("Number is too low, try something higher.");
                if (userGuess == randomNumber) {
                    System.out.println("That number is correct!");
                    correct = 1;

                }
                // counter to keep running total of times guessed
                guesses++;
                System.out.println("You have guessed " + guesses + " times!");
            }
            System.out.println("Would you like to guess again? y/n");
            playGame = scan.next();






    }
}

