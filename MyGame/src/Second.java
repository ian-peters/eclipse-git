/* Author: Iain Peters
 * Date: Dec 13th, 2022
 * Last modified: Dec 13th
 * Description: TicTacToe game where you can play against a computer or another user.
 * ToDo: 
 * 
 */


import java.util.Scanner;

public class Second {

	
	final int VS_COMPUTER = 0;
	final int TWO_PLAYER = 1;
	final int CREDITS = 3;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean stop = true;
		boolean gameOver = false;
		
		char[][] board = {{' ',' ',' '},
						 {' ',' ',' '},
						 {' ',' ',' '}};
		
		userMove placement = new userMove();
		WinChecker winnerCheck = new WinChecker();
		computerMove compMove = new computerMove();
		int numberPicked;	 
		Boolean twoPlayer = false;
		int userMove = 0;		
		
		/*
		 * Gathers user inputs and calls the appropriate methods
		 */
		
		
		/*
		 * Menu system with 3 branches
		 */
		System.out.printf("Welcome. \n"
				+ "(1) Two player \n"
				+ "(2) Vs. computer\n"
				+ "(3) Credits: ");
		numberPicked = keyboard.nextInt();
		switch(numberPicked) {
		case 1:
			twoPlayer = true;
			break;
		case 2:
			twoPlayer = false;
			break;
		case 3:
			System.out.print("Program by Ian. ");
			System.exit(0);
			break;	
		}
			
		
		//Beginning of main program loop
		while(gameOver != true)   {
		System.out.print("Your turn (1-9): ");
		boolean hasNextInt = false;				//important variables for the interior loops
		boolean isInputBad = true;
		
		
		
		/*
		 * While loop that validates inputs as numeric and within the accepted numeric range 
		 */
		
		while (stop) {
			while(isInputBad) {
				hasNextInt = keyboard.hasNextInt();
				if (hasNextInt) {
					userMove = keyboard.nextInt();
					isInputBad = false;
				}
				else {
					System.out.println("input a number");
				}
				keyboard.nextLine();						//clears up input stream to prevent infinite loop
			}
		
			if (placement.dataValidator(userMove)) {
				stop = false;
			}
			else {
				stop = true;
			}
	
		}
	
		isInputBad = true;		//Again, prevents infinite loop
		stop = true;
		
	
		
		int secondPlayersMove;
		boolean repeat = true;
		boolean repeatedMove = true;
		
		while(repeatedMove) {
			if (placement.playerMove(board, userMove, 'x')) {
				WinChecker.winnerCheck(board);			//Prevents the computer from infinitely selecting filled positions at the end of the game
				repeatedMove = false;
				while(repeat) {
				
					if (WinChecker.getWinner() != 3) {		
						gameOver = true;
						break;
					}
					if (twoPlayer == true) {
						System.out.print("2nd players turn (1-9): ");
						secondPlayersMove = keyboard.nextInt();
						placement.playerMove(board, secondPlayersMove, 'o');
						WinChecker.winnerCheck(board);
						if (WinChecker.getWinner() != 3) {
							gameOver = true;
							break;
						}
						repeat = false;
						
					}
					else {
							
						if (compMove.cpuMove(board, userMove, 'o')) {
								repeat = false;
							
						if (WinChecker.winnerCheck(board)) {
								gameOver = true;
								break;
						}
						}
						else {
							repeat = true;
							compMove.cpuMove(board, userMove, 'o');
						}
						
					}
			
				}
				
			}
			else {
				repeatedMove = true;
				userMove = keyboard.nextInt();
			}
		}
		printBoard(board);
		
		}
		
		
		/*
		 * Different if-statements depending on whether two players are playing or it's user vs. computer
		 */
		
		if (numberPicked == 1) {
			if (WinChecker.getWinner() == 0) {
				System.out.println("Second player WINS!!!!");
			}
			else if (WinChecker.getWinner() == 1) {
				System.out.println("It's a draw");
			}
			else {
				System.out.println("First player WINS!!!!");
			}
		}
		if(numberPicked == 2) {
			if (WinChecker.getWinner() == 0) {
				System.out.println("The computer has won, Oh no no no no.");
			}
			else if (WinChecker.getWinner() == 1) {
				System.out.println("It's a draw");
			}
			else {
				System.out.println("Congrats!!! you WIN!!!");
			}
		
		}

	}
	
	/*
	 * Prints the board 
	 * board[line - 0 = top][position - 0 = left]
	 */
	
	private static void printBoard(char board[][]) {
		System.out.print(board[0][0]);
		System.out.print("|");
		System.out.print(board[0][1]);
		System.out.print("|");
		System.out.println(board[0][2]);
		System.out.println("-----");
		System.out.print(board[1][0]);
		System.out.print("|");
		System.out.print(board[1][1]);
		System.out.print("|");
		System.out.println(board[1][2]);
		System.out.println("-----");
		System.out.print(board[2][0]);
		System.out.print("|");
		System.out.print(board[2][1]);
		System.out.print("|");
		System.out.println(board[2][2]);
		System.out.println("-----");
	}
		
	
	

}
