/*
 * Student Name: 
 * Lab Professor: 
 * Due Date: 
 * Description: 
 */
public class Program {

	/*
	 * Add programmer comments here.
	 */
	public static void main(String[] args) {
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;
		DiceChecker diceChecker = new DiceChecker();
		//boolean HasUserStopped = false;
		
		
		
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
				//HasUserStopped = true;
				break;	
			}
		} while (option != 4);
		//while(option == 0 || option == 1 || option == 2 || option == 3);
		//while(HasUserStopped == false);
		System.out.print("Program by Iain Peters");
		// do while loop
		//     output menu options
		//     get user option
		//     use switch, delegate actions to diceChecker as needed
		// output your name at end of program

	}

}
