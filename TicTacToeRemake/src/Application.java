/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: TicTacToe program 
 */

/*
 * This class contains a menu system that allows the user to select a single player or two player game mode.
 * Different sets of method calls are used depending on the users choice of game mode.
 */

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
	printBoard printedBoard = new printBoard();
	placeMove nextMove = new placeMove();
	EndOfGame gameOverCheck = new EndOfGame();
	TurnChanger changeTurn = new TurnChanger();
	
	boolean gameNotOver = true;
	int userMove= 0;
	int gameMode = 0;

	
	char[][] board =  {{' ',' ',' '},
					   {' ',' ',' '},
					   {' ',' ',' '}};
	
	
	
	//Menu that allows the user to select 2 different game modes
	System.out.println("Enter 1 to play vs. the computer \n"
					 + "Enter 2 for two player mode");
	gameMode = nextMove.StringInput();
	
	while (gameMode != 1 && gameMode != 2) {
		System.out.print("Please enter 1 or 2: ");
		gameMode = nextMove.StringInput();
	}

	
	while (gameNotOver) {
		userMove = nextMove.properRange("Enter your move: ");	//Validates users input as an integer ranging from 1 to 9
	
		//First players turn, always executes
		changeTurn.playerTurn(board, userMove, 'x');
		if (gameOverCheck.CallMethod(board, gameMode) != 0) {
			gameNotOver = false;
			break;							
		}
		
		//Computers turn, if that mode is selected
		if (gameMode == 1) {
			changeTurn.computerTurn(board);
			if (gameOverCheck.CallMethod(board, gameMode) != 0) {	
				gameNotOver = false;
				break;
			}
		}
		
		//Second players turn
		if (gameMode == 2) {
			printedBoard.printBoard(board);				//Updates the board after each player move
			userMove = nextMove.properRange("Enter your move: ");
			changeTurn.playerTurn(board, userMove, 'o');
			if (gameOverCheck.CallMethod(board, gameMode) != 0) {
				gameNotOver = false;
				break;
			}
		}
		
		printedBoard.printBoard(board);	
	}
	printedBoard.printBoard(board);	
	System.out.print(gameOverCheck.printEndMessage());
	}
}
