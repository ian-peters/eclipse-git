/* Author: Iain Peters
 * Date: Dec 13th, 2022
 * Last modified: Dec 13th
 * Description: TicTacToe game where you can play against a computer or another user (soon)
 * ToDo: 
 * 1 Prevent user and computer from placing their x or o in a spot that already has one. 
 * 2 Create a menu system that allows the user to choose whether they wish to play against the computer or another player
 * 3 Implement 2 player functionality
 */
public class WinChecker {
	
	private static boolean winner = false;
	public WinChecker () {}
	private static boolean computerWin = false;
	private static boolean draw = false;
	
	private static int whoWins = 2;

	
	
	/*
	 * Responsible for determining if the user or the computer has won
	 * a return of false = user win
	 */
	
	public static int getWinner() {
		return whoWins;
	}

	public static void setComputerWin(int compWon) {
		whoWins = compWon;
	}
	
	
	public static void setDraw(int aDraw) {
		whoWins = aDraw;
	}
	
	/*
	public static boolean getComputerWin() {
		return computerWin;
	}
	public static void setComputerWin(boolean computerWin) {
		WinChecker.computerWin = computerWin;
	}
	
	public static void setDraw(boolean draw) {
		WinChecker.draw = draw;
	}
	
	public static boolean getDraw() {
		return draw;
	}
	*/
	
	

	/*
	 * Responsible for checking whether the user has won
	 */
	//public static boolean winnerCheck (char board[][]){ 
	public static boolean winnerCheck (char board[][]){ 
			//Left to right
		if ((board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') ||
			(board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x') ||
			(board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x') ||
			
			//Top to bottom
			(board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x') ||
			(board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x') ||
			(board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x') ||
			
			//Diagonal
			(board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') ||
			(board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') )
		{ 
			setComputerWin(2);
			winner = true;
		
			}
		
		
		/*
		 * Checks if the computer has won
		 */
		else if ((board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') ||
				(board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o') ||
				(board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o') ||
				
				//Top to bottom
				(board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o') ||
				(board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o') ||
				(board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o') ||
				
				//Diagonal
				(board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') ||
				(board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') )
			{ 
				setComputerWin(0);
				winner = true;
				
				}
		
		else if ((board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ') &&
				 (board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ') &&
				 (board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ')) 
				 {
				 setDraw(1);
				 }
	
	   return winner;
	}

	
	
}
