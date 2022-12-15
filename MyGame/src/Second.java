/* Author: Iain Peters
 * Date: Dec 13th, 2022
 * Last modified: Dec 13th
 * Description: TicTacToe game where you can play against a computer or another user (soon)
 * ToDo: 
 * 0 Fix Data validation - broken again
 * 2 Create a menu system that allows the user to choose whether they wish to play against the computer or another player
 * 3 Implement 2 player functionality. Updated ToDo.
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
		Boolean menu = true;
		int numberPicked;	 
		Boolean twoPlayer = false;
		int userMove = 0;
		
		
		/*
		 * Gathers user inputs and calls the appropriate methods
		 */
		
		System.out.print("Welcome. Select 2 player (1) or vs. computer (2)");
		numberPicked = keyboard.nextInt();
		
		switch(numberPicked) {
		case 1:
			twoPlayer = true;
		case 2:
			twoPlayer = false;
			
		}
			
		
		while(gameOver != true) {
		
		
		/*
		 * Menu system
		 */
	
		
			
		
		
		System.out.print("Enter your move (1-9) ");
		boolean hasNextInt = false;
		boolean isInputBad = true;
		
		
		
		/*
		 * While loop that ensures correct inputs
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
				keyboard.nextLine();
			}
		
			if (placement.dataValidator(userMove)) {
				stop = false;
			}
			else {
				stop = true;
			}
			
			
			
			
			
		
		}
	
		isInputBad = true;
		stop = true;
		
		boolean repeat = true;
		boolean repeatedMove = true;
		while(repeatedMove) {
			if (placement.playerMove(board, userMove, 'x')) {
				WinChecker.winnerCheck(board);
				
				repeatedMove = false;
				while(repeat) {
				
					if (WinChecker.getWinner() != 3) {
						gameOver = true;
						break;
					}
					if (twoPlayer == true) {
						placement.playerMove(board, userMove, 'o');
						//insert other input here
						WinChecker.winnerCheck(board);
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
		// keyboard.nextLine();
		}
		
		
		
		//placement.playerMove(board, userMove, 'x');
		//compMove.cpuMove(board, userMove, 'o');
		printBoard(board);
		
		
		}
		
		
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
		
	
	/*
	 * User move placement
	 *//*
	private static void playerMove(char[][] board, int position) {
	switch(position) {
	case 1:
		board[0][0] = 'x';
		break;
		
	case 2:
		board[0][1] = 'x';
		break;
		
	case 3:
		board[0][2] = 'x';
		break;
		
	case 4:
		board[1][0] = 'x';
		break;
		
	case 5:
		board[1][1] = 'x';
		break;
		
	case 6:
		board[1][2] = 'x';
		break;
		
	case 7:
		board[2][0] = 'x';
		break;
		
	case 8:
		board[2][1] = 'x';
		break;
		
	case 9:
		board[2][2] = 'x';
		break;
		
	default:
		break;
	}
	}*/

}
