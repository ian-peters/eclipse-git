
public class EndOfGame {
	private int result;
	
	public EndOfGame() {}
	
	
	public String printEndMessage() {
		String endMessage = null;
		switch(result) {
		case 1:
			endMessage = "Player 1 wins!";
			break;
		case 2:
			endMessage = "It's a draw!";
			break;
		case 3:
			endMessage = "The Computer wins!";
			break;
		default:
			break;
		}
		return endMessage;
	}
	
	
	public int CallMethod(char[][] board, char symbol) {
		int result = 0;
		if (wonDiagonal(board, symbol) != 0) {
			result = wonDiagonal(board, symbol);
			this.result = result;
		}
		else if (testGame (board, symbol) != 0) {
			result = testGame (board, symbol);
			this.result = result;
		}

		return result;
	}
	
	
	
	
	public int wonDiagonal(char[][] board, char symbol){
		int count = 0;
		int result = 0;
		
		for (int column = 0; column < 3; column++) {
			if (board[column][column] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
			this.result = result;
		}
		else {
			count = 0;
		}
		return result;
		}
	 
	
	/*
	 * Determines if the game has ended by a straight line 
	 */
	
	public int testGame(char[][] board, int symbol){
	//Horizontal check
	for (int column = 0; column < 3; column++) {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			if (board[row][column] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
		}
	}
	
	//Vertical check
	for (int column = 0; column < 3; column++) {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			if (board[column][row] == symbol) {
				count++;
			}
		}
		if (count == 3) {
			result = 1;
		}
	}
	
	
	
	return result;
	
	}
	
	public int EndGame(char[][] board) {
			result = 0;
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
			(board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') ) {
			result = 1;
			
		}
		else if 
		   ((board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') ||
			(board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o') ||
			(board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o') ||
						
			//Top to bottom
			(board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o') ||
			(board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o') ||
			(board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o') ||
						
			//Diagonal
			(board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') ||
			(board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') ) {
			result = 2;
			
		}
		else if
		   ((board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ') &&
			(board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ') &&
			(board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ')) {
			 result = 2;
		}
		else {
			result = 0;
		}
			
		return result;	
		 
	}
	
}
