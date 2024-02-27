package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		
		//generate a random number between 1 - 100
		Random random = new Random();		
		int theRandomNumber = random.nextInt(100) + 1;
		
		//prompt the player to enter a number between 1 - 100
		gameMessage("Enter a number between 1 and 100: ");
		
		//generate user input and convert the string type input into an integer
		Scanner scanner = new Scanner(System.in);
		
		//Check if the player's input is valid (between 1-100). If not, print error message and repeat
		//The player only gets 5 chances to guess the number. If they lose, output “You lose, the number to guess was theRandomNumber”
		int userGuessCount = 0;
		int maxTries = 5;
		boolean winCondition = false;
		
	    while (userGuessCount < maxTries && winCondition == false) {
	        String userInput = scanner.nextLine();
	        int userGuess = Integer.parseInt(userInput);
	        if (userGuess < 1 || userGuess > 100) {
	            gameMessage("Your guess is not between 1 and 100, please try again");
	        } else {
	            userGuessCount++;
	            if (userGuess == theRandomNumber) {
	                gameMessage("You win!");
	                winCondition = true;
	            } else if (userGuess > theRandomNumber) {
	                gameMessage("Please pick a lower number");
	            } else {
	                gameMessage("Please pick a higher number");
	            }
	        }
	    }

	    // check to see if the player lost
	    if (winCondition == false) {
	        System.out.println("You lose, the number was " + theRandomNumber);
	    }

		
		scanner.close();
	}
	//method to output game message. Shorter version of System.out.println
	private static void gameMessage(String message) {
		  System.out.println(message); 

		}
	}
