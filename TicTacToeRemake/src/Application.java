/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: Remake of the TicTacToe program with more emphasis on OOP
 */

/*
 * 
 */
public class Application {

	public static void main(String[] args) {
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
		
		//Game Over is checked after each turn.
		changeTurn.playerTurn(board, userMove);
		if (gameOverCheck.CallMethod(board) != 0) {
			gameNotOver = false;
			
		}
		else {
			changeTurn.computerTurn(board);
			if (gameOverCheck.CallMethod(board) != 0) {	
				gameNotOver = false;
			}
		}
		
		printedBoard.printBoard(board);	

	}
	//printedBoard.printBoard(board);	
	System.out.print(gameOverCheck.printEndMessage());
	}
}
