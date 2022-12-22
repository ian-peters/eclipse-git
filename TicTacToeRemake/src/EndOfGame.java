/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: Remake of the TicTacToe program with more emphasis on OOP
 */


public class EndOfGame {
	private int result;
	private int movesLeft = 9;
	private static final int PLAYER1_WIN = 1;
	private static final int DRAW = 2;
	private static final int COMPUTER_WIN = 3;
	private static final int PLAYER2_WIN = 4;

	
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
		case 4:
			endMessage = "Player 2 wins!";
			break;
		default:
			break;
		}
		return endMessage;
	}
	
	
	/*
	 * Catch-all method created to simplify calls to this classes methods
	 */
	public int CallMethod(char[][] board, int gameMode) {
	int result = 0;
	movesLeft--;
		if (wonDiagonal(board, 'x') == 1 || testGame(board, 'x') == 1) {
			result = PLAYER1_WIN;
		}
		else if (movesLeft == 0) { 
			result = DRAW;
		}
		else if ((wonDiagonal(board, 'o') == 1 || testGame(board, 'o') == 1) && gameMode == 1) {
			result = COMPUTER_WIN; 
		}
		else if ((wonDiagonal(board, 'o') == 1 || testGame(board, 'o') == 1) && gameMode == 2) {
			result = PLAYER2_WIN; 
		}
			
	this.result = result;
	return result;
		
	}

	/*
	 * This method determines if the game has been ended by a diagonal line.
	 */
	
	private int wonDiagonal(char[][] board, char symbol){
	int count = 0;
	int result = 0;
	// Check first diagonal (1, 5, 9)
		for (int column = 0; column < 3; column++) {
			if (board[column][column] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
		}
		else {
			count = 0;
		}

    // Check second diagonal (3, 5, 7)
		for (int column = 0; column < 3; column++) {
			if (board[column][2 - column] == symbol) {	
          	count++;
			}
		}
		if (count == 3) {
			result = 1;
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
	//Vertical check
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
		}
	}
	
	//Horizontal check
	for (int column = 0; column < 3; column++) {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			if (board[column][row] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;		
		}
	}
	return result;
	}
	
}
