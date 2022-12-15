/* Author: Iain Peters
 * Date: Dec 13th, 2022
 * Last modified: Dec 13th
 * Description: TicTacToe game where you can play against a computer or another user (soon)
 * ToDo: 
 * 1 Prevent user and computer from placing their x or o in a spot that already has one. 
 * 2 Create a menu system that allows the user to choose whether they wish to play against the computer or another player
 * 3 Implement 2 player functionality
 */
public class userMove {
	private char input;
	char[][] userDoubleInput = new char[2][2];
	
	userMove() {}
	
	
	/*
	 * if (userDoubleInput[input-1] == 1) {
		System.out.print("That square is already filled");
		validate = false;
	}
	 * Input validation
	 */
	
	public boolean dataValidator (int input){
	boolean validate = false;
	
	
	if (input < 0 || input > 9) {
		System.out.print("Invalid input. Try again");
		validate = false;	
	}
	else {
		validate = true;
		
	}
	
	return validate;
	}
	
	public char[][] setBoard(){
		return userDoubleInput;
	}
	/*
	 * This method places moves of the player/computer and prevents the user from repeating their moves.
	 * ToDo: Prevent the user from making a move on spaces that the computer has already made a move
	 * also: prevent computer from making repeated moves
	 */
	
	public boolean playerMove(char[][] board, int position, char X_or_O) {
		boolean inputtedFilledSpace = true;
		switch(position) {
		case 1:
			if (board [0][0] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [0][0] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[0][0] = X_or_O;
				break;
			}
			
		case 2:
			if (board [0][1] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [0][1] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[0][1] = X_or_O;
				break;
			}
			
			
		case 3:
			if (board [0][2] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [0][2] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[0][2] = X_or_O;
				break;
			}
			
		case 4:
			if (board [1][0] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [1][0] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[1][0] = X_or_O;
				break;
			}
			
			
		case 5:
			if (board [1][1] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [1][1] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[1][1] = X_or_O;
				break;
			}
			
			
		case 6:
			if (board [1][2] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [1][2] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[1][2] = X_or_O;
				break;
			}
			
		case 7:
			if (board [2][0] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [2][0] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[2][0] = X_or_O;
				break;
			}
			
			
		case 8:
			if (board [2][1] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [2][1] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[2][1] = X_or_O;
				break;
			}
			
			
		case 9:
			if (board [2][2] == 'x') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else if (board [2][2] == 'o') {
				System.out.println("Space is filled.");
				inputtedFilledSpace = false;
				break;
			}
			else {
				board[2][2] = X_or_O;
				inputtedFilledSpace = true;
				break;
			}
			
		default:
			break;
		}
		//board = userDoubleInput;
		return inputtedFilledSpace;
		}
	
}
