/*
 * Student Name: Iain Peters
 * Lab Professor: Stanley Pieda
 * Due Date: December 9th, 2022
 * Last Modified: November 26th, 2022
 * Description: Assignment 03 starter code. Comments added and updated to output my name.
 */

/*
 * Assignment03IainPeters class that contains the main method and two for loops
 */
public class Assignment03IainPeters {

	/*
	 * The main method contains all variables, references to objects, and input/outputs
	 */
	public static void main(String[] args) {
		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 10) + 1;
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		for(int index = 0; index <= diceRolls.length; index++) {  // crashes
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Iain Peters");


	}

}
