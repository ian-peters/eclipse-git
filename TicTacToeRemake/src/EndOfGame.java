/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: Remake of the TicTacToe program with more emphasis on OOP
 */


public class EndOfGame {
	private int result;
	
	/*
	 * No argument constructor;
	 */
	public EndOfGame() {}
	
	/*
	 * Method responsible for returning the proper end result message
	 */
	public String printEndMessage() {
		String endMessage = null;
		switch(result) {
		case 1:
			endMessage = "Player 1 wins!";
			break;
		case 2:
			endMessage = "It's a draw!";
			break;
		case 3:
			endMessage = "The Computer wins!";
			break;
		default:
			break;
		}
		return endMessage;
	}
	
	
	/*
	 * Catch-all method created to simplify calls to this classes methods
	 */
	public int CallMethod(char[][] board, char symbol) {
	int result = 0;
		if (wonDiagonal(board, symbol) != 0) {
			result = wonDiagonal(board, symbol);
			
			result = this.result;
		}
		else if (testGame (board, symbol) != 0) {
			result = testGame (board, symbol);
			result = this.result;
		}
		return result;
	}
	
	
	/*
	 * This method determines if the game has been ended by a diagonal line.
	 */
	
	private int wonDiagonal(char[][] board, char symbol){
	int count = 0;
	int result = 0;
	// Check first diagonal (1-9)
		for (int column = 0; column < 3; column++) {
			if (board[column][column] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
			this.result = result;
		}
		else {
			count = 0;
		}

    // Check second diagonal (3-7)
		for (int column = 0; column < 3; column++) {
			if (board[column][2 - column] == symbol) {	
          	count++;
			}
		}
			if (count == 3) {
				result = 1;
				this.result = result;
			}
			else {
				count = 0;
			}
    return result;
	}
 
	
	/*
	 * This method determines if the game has been ended by a straight line.
	 */	
	private int testGame(char[][] board, int symbol){
	//Horizontal check
	int result = 0;
	for (int column = 0; column < 3; column++) {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			if (board[row][column] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
			this.result = result;
		}
	}
	
	//Vertical check
	for (int column = 0; column < 3; column++) {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			if (board[column][row] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
			this.result = result;
		}
	}
	return result;
	}
	
}
