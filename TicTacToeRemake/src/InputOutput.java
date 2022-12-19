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
	TurnChanger changeTurn = new TurnChanger();
	
	boolean gameNotOver = true;
	int userMove= 0;
	int count = 0;

	
	char[][] board =  {{' ',' ',' '},
					   {' ',' ',' '},
					   {' ',' ',' '}};
	
	
	while (gameNotOver) {
		userMove = nextMove.properRange("Enter your move: ");	//Validates users input as an integer ranging from 1 to 9
		
		changeTurn.playerTurn(board, userMove);
		changeTurn.computerTurn(board);
		
		printedBoard.printBoard(board);	
		
		
	
		
		if (gameOverCheck.CallMethod(board) != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}
		/*
		//Checks if the game is over
		if (gameOverCheck.CallMethod(board, 'x') != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}
		else if (gameOverCheck.CallMethod(board, 'o') != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}*/
	
	
		}
	}
}
