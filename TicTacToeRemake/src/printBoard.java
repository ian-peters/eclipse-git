/*
 * Author: Ian Peters
 * Date: Dec 16th
 * Last Modified: Dec 16th
 * Description: Remake of the TicTacToe program with more emphasis on OOP
 */

public class printBoard {
	
	printBoard() {}
	    public void printBoard(char board[][]) {
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
