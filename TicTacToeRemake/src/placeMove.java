
public class placeMove {
	private char[][] board;
	public placeMove () {}
	
	public String repeatedMove(int placement) {
		
		return " ";
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
