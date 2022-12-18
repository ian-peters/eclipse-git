/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: Remake of the TicTacToe program with more emphasis on OOP
 */

import java.util.Scanner;


public class InputOutput {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	printBoard printedBoard = new printBoard();
	placeMove nextMove = new placeMove();
	EndOfGame gameOverCheck = new EndOfGame();
	boolean gameNotOver = true;
	boolean invalidInput = true;
	int userMove= 0;

	
	char[][] board =  {{' ',' ',' '},
					   {' ',' ',' '},
					   {' ',' ',' '}};
	
	
	while (gameNotOver) {
		
		userMove = nextMove.properRange("Enter your move: ");	//Validates users input as an integer ranging from 1 to 9
		
		//Selected position on the board must be empty 
		if (nextMove.repeatedMove(board, userMove) == 1) {
		}	
		else {
			nextMove.insertMove(board, userMove, 'x');
			printedBoard.printBoard(board);	
		}
		
		//Checks if the game is over
		if (gameOverCheck.CallMethod(board, 'x') != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}
	
	
		}
	}
}
