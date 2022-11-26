/*
 * Student Name: Iain Peters
 * Lab Professor: Stanley Piedas
 * Due Date: November 25th
 * Description: Lab Exercise 05 Finished code
 */
public class Program {

	/*
	 * The main method uses a case structure menu to determine what the user wishes to do. All inputs are delegated to the User class.
	 */
	public static void main(String[] args) {
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;
		DiceChecker diceChecker = new DiceChecker();
		
		do {
			System.out.print("1 Enter Dice Roll Values \n2 Display Report \n3 Reset Dice Roll Data \n4 Exit Program \n");
			option = User.inputInteger();
			switch (option) {
			case ENTER_VALUES:
				diceChecker.enterData();
				break;
			case DISPLAY_REPORT:
				diceChecker.printReport();
				break;
			case RESET_VALUES:
				diceChecker.resetData();
				break;
			case EXIT_PROGRAM:
				break;	
			}
		} while (option != 4);
		System.out.print("Program by Iain Peters");
	}

}
