/* Author: Iain Peters
 * Date: Dec 13th, 2022
 * Last modified: Dec 13th
 * Description: TicTacToe game where you can play against a computer or another user (soon)
 * ToDo: 
 * 0 Fix Data validation - broken again
 * 1 Prevent user and computer from placing their x or o in a spot that already has one. 
 * 2 Create a menu system that allows the user to choose whether they wish to play against the computer or another player
 * 3 Implement 2 player functionality. Updated ToDo.
 * 
 */


import java.util.Scanner;

public class Second {

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
		
		int userMove = 0;
		
		
		/*
		 * Gathers user inputs and calls the appropriate methods
		 */
		while(gameOver != true) {
		
		
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
				
				repeatedMove = false;
			}
			else {
				repeatedMove = true;
				userMove = keyboard.nextInt();
			}
		// keyboard.nextLine();
		}
		
		while(repeat) {
			if (compMove.cpuMove(board, userMove, 'o')) {
				repeat = false;
			}
			else {
				repeat = true;
			}
		}
		
		
		//placement.playerMove(board, userMove, 'x');
		//compMove.cpuMove(board, userMove, 'o');
		printBoard(board);
		
		if (WinChecker.winnerCheck(board)) {
			gameOver = true;
		}
		
		
		} 
		
		if (WinChecker.getComputerWin() == false) {
			System.out.println("Congrats!!! you WIN!!!");
		}
		else {
			System.out.println("The computer has won, Oh no no no no.");
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
