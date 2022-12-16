
public class placeMove {
	private char[][] board;
	public placeMove () {}
	
	/*
	public int repeatedMove(int placement) {
		int repeat = 0;
		if (board[0][0] == 'x') {
			System.out.println("No space");
			repeat = 1;
		}
		else {
			
			
		}
	return repeat;
	}*/
	
	
	

	public int repeatedMove(char[][] board, int placement) {
		int repeat = 0;
		switch(placement) {
		case 1:
			if (board[0][0] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
		case 2:
			if (board[0][1] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
		case 3:
			if (board[0][2] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
		case 4:
			if (board[1][0] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
		case 5:
			if (board[1][1] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
		case 6:
			if (board[1][2] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
			
			
		case 7:
			if (board[2][0] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
				
		case 8:
			if (board[2][1] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
			
		case 9:
			if (board[2][2] == 'x') {
				System.out.println("No space");
				repeat = 1;
			}
				break;
		}
		return repeat;
	}
			
	
	
	public void insertMove (char[][] board, int placement, char symbol) {
		this.board = board;
	
		switch(placement) {
		case 1:
			board[0][0] = symbol;
			break;
			
		case 2:
			board[0][1] = symbol;
			break;
			
		case 3:
			board[0][2] = symbol;
			break;
			
		case 4:
			board[1][0] = symbol;
			break;
			
		case 5:
			board[1][1] = symbol;		
			break;
			
		case 6:
			board[1][2] = symbol;
			break;
			
		case 7:
			board[2][0] = symbol;
			break;
			
		case 8:
			board[2][1] = symbol;		
			break;
			
		case 9:
			board[2][2] = symbol;
			break;
			
			
			
		}
	}
}
