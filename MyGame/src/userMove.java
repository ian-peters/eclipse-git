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
	int[] userDoubleInput = new int[9];
	
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
	
	
	
	
	public char[][] playerMove(char[][] board, int position, char X_or_O) {
		
		switch(position) {
		case 1:
			board[0][0] = X_or_O;
			break;
			
		case 2:
			board[0][1] = X_or_O;
			break;
			
		case 3:
			board[0][2] = X_or_O;
			break;
			
		case 4:
			board[1][0] = X_or_O;
			break;
			
		case 5:
			board[1][1] = X_or_O;
			break;
			
		case 6:
			board[1][2] = X_or_O;
			break;
			
		case 7:
			board[2][0] = X_or_O;
			break;
			
		case 8:
			board[2][1] = X_or_O;
			break;
			
		case 9:
		    board[2][2] = X_or_O;
			break;
			
		default:
			break;
		}
		return board;
		}
	
}
