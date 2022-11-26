/*
 * Student Name: Iain Peters
 * Lab Professor:  Stanley Pieda
 * Due Date: December 4th, 2022
 * Description: Lab Exercise 05 Finished code.
 */

/*
 * The DiceChecker class contains the programs worker methods that are referenced throughout the main method.
 * This class accounts for the dice rolls that were entered by the user, and can also print the entered dice roll 
 * statistics. It also has the functionality to clear the previously entered rolls, allowing the user
 * to begin entering a new set of dice rolls.
 */
public class DiceChecker {
	private final int DICE_SIZE; // Initialization deferred to constructor
	private int[] values = null;
	
	/*
	 * No-argument constructor, sets the size of the dice to 8-sides
	 * as a default value.
	 */
	public DiceChecker() {
		this(8); // default to 8 sided dice
	}
	
	/*
	 * Overloaded constructor accepts the dice face count to make
	 * the program more flexible for dice with different number of sides.
	 * e.g. 4-sided, 6-sided and so on. If the dice size is less than 4
	 * then it will be set to 4 by default.
	 */
	public DiceChecker(int faceCount) {
		if(faceCount < 4) {
			faceCount = 4;
		}
		// (non-static constant can have initialization
		// deferred to a constructor).
		DICE_SIZE = faceCount;
		values = new int[DICE_SIZE];
	}
	
	/*
	 * This method prompts the user to enter integer values between 1, i.e. min,
	 * to the max value which is based on the DICE_SIZE constant value. After each 
	 * value the user is asked if they would like to enter more values (y/n).
	 * Each value is used as an index, offset by -1, in the array and for
	 * each entry the count stored in the associated element is increased by 1.
	 */
	public void enterData() {
		int input = 0;
		int min = 1;
		int max = DICE_SIZE;
		String continueDataEntry = null;
		do {
			input = User.inputInteger("Enter dice value: ", min, max);
			// numbers will be from 1 to DICE_SIZE, so offset by -1 as index
			// and add 1 to the value in the indexed element.
			// i.e. face value 1 is stored at index 0 and so on.
			values[input - 1]++;
			continueDataEntry = User.inputString("Enter another? (y/n): ");
		}while(continueDataEntry.equalsIgnoreCase("y") );
	}
	
	/*
	 * This method uses two for loops to display how many times each side of dice was rolled. 
	 * First the label for the dice side is printed, then how many times that side was rolled
	 * is printed in a series of asterisks (*). 
	 * 
	 */
	public void printReport() {
		for (int index = 0; index < DICE_SIZE; index++) {
			System.out.printf("%3d ", (index + 1));
			for (int count = 1;  count <= values[index]; count++) {
				System.out.printf("*");	
			}
			System.out.println();
		}
	}
	
	/*
	 * This method iterates over the values array and
	 * places zero into each element.
	 */
	public void resetData() {
		for(int index = 0; index < values.length; index++) {
			values[index] = 0; // zero out each element
		}
	}
}
