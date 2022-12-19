import java.util.Scanner;

/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: Remake of the TicTacToe program. ToDo: Make the program recognize if the computer has won.
 */
public class placeMove {
	Scanner keyboard = new Scanner(System.in);
	public placeMove () {}
	
	/*
	 * This method validates that the user has entered a valid move (1-9)
	 */
	public int properRange(String prompt) {
		System.out.print(prompt);				//Outputs the text in our method call parameters
		int input = 0;
		boolean isWithinRange = false;
		
		while (isWithinRange == false) {
			input = StringInput();				//collects the users input
			if (input >= 1 && input <= 9) {
				isWithinRange = true;
			}
			else {
				System.out.println("Please enter a valid move");
			}
		}
		return input;
	}
	
	/*
	 * This method validates that user has entered an integer.
	 */
	public int StringInput() {
		int input = 0;
		boolean isInputBad = true;
		boolean hasNextInt = true;
		
		while(isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if (hasNextInt == false) {
				System.out.println("Please enter an integer.");
			}
			else {
				input = keyboard.nextInt();
				isInputBad = false;
			}
			keyboard.nextLine();		//cleans up the input stream
		}
		return input;	
	}
	
	
	/*
	 * This method prevents the user or computer from repeating a move.
	 */
	public int repeatedMove(char[][] board, int placement) {
		int repeat = 0;
		switch(placement) {
		case 1:
			if (board[0][0] == 'x' || board[0][0] == 'o') { 
				repeat = 1;
			}
				break;			
		case 2:
			if (board[0][1] == 'x' || board[0][1] == 'o') {
				
				repeat = 1;
			}
				break;
		case 3:
			if (board[0][2] == 'x' || board[0][2] == 'o') {
				
				repeat = 1;
			}
				break;
		case 4:
			if (board[1][0] == 'x' || board[1][0] == 'o') {
				repeat = 1;
			}
				break;
		case 5:
			if (board[1][1] == 'x' || board[1][1] == 'o') {
				repeat = 1;
			}
				break;
		case 6:
			if (board[1][2] == 'x' || board[1][2] == 'o') {
				repeat = 1;
			}
				break;
		case 7:
			if (board[2][0] == 'x' || board[2][0] == 'o') {
				repeat = 1;
			}
				break;
		case 8:
			if (board[2][1] == 'x' || board[2][1] == 'o') {
				repeat = 1;
			}
				break;			
		case 9:
			if (board[2][2] == 'x' || board[2][2] == 'o') {
				repeat = 1;
			}
				break;
		}
		return repeat;
	}
			
	/*
	 * This method places the moves on to the board.
	 */
	public void insertMove (char[][] board, int placement, char symbol) {

		switch(placement) {
		case 1:
			board[0][0] = symbol;
			break;
			
		case 2:
			board[0][1] = symbol;
			break;
			
		case 3:
			board[0][2] = symbol;
			break;
			
		case 4:
			board[1][0] = symbol;
			break;
			
		case 5:
			board[1][1] = symbol;		
			break;
			
		case 6:
			board[1][2] = symbol;
			break;
			
		case 7:
			board[2][0] = symbol;
			break;
			
		case 8:
			board[2][1] = symbol;		
			break;
			
		case 9:
			board[2][2] = symbol;
			break;

		}
	}
}
