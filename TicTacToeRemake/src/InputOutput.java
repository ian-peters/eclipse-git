import java.util.Scanner;


public class InputOutput {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	printBoard printedBoard = new printBoard();
	placeMove nextMove = new placeMove();
	EndOfGame gameOverCheck = new EndOfGame();
	boolean gameNotOver = true;
	int userMove;

	
	char[][] board =  {{' ',' ',' '},
					   {' ',' ',' '},
					   {' ',' ',' '}};
	
	
	while (gameNotOver) {
		
		System.out.print("Enter your move: ");
		userMove = keyboard.nextInt();
		nextMove.insertMove(board, userMove, 'x');
		printedBoard.printBoard(board);
		
		if (gameOverCheck.CallMethod(board, 'x') != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}
		
		
		
		
		
		/*
		if(gameOverCheck.wonDiagonal(board, 'x') != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}
		
		if(gameOverCheck.testGame(board, 'x') != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
			
		}
		
		if (gameOverCheck.EndGame(board) != 0) {
			System.out.print(gameOverCheck.printEndMessage());
			gameNotOver = false;
		}*/
		
		
		
	
	
	}
	}

}
