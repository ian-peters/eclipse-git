
public class TurnChanger {

	public TurnChanger() {}
	placeMove nextMove = new placeMove();
	printBoard printedBoard = new printBoard();
	
	
	/*
	 * This method is called when it is the players turn
	 */
	public void playerTurn (char[][] board, int userMove) {
		boolean playTurn = true;
		
		while(playTurn) {
			if (nextMove.repeatedMove(board, userMove) == 1) {		//Selected position on the board must be empty
				System.out.println("No Space");
				userMove = nextMove.properRange("Enter your move: ");
			}	
			else {
				nextMove.insertMove(board, userMove, 'x');
				playTurn = false;
			}	
		}
		
	}
	
	/*
	 * This method is called when it is the computers turn
	 */
	public void computerTurn(char[][] board) {
		boolean compTurn = true;
		
		while(compTurn) {
			double rollValue = (Math.random() + 0.1) * 9;		//Selects a random number for the computers turn
			int compMove = (int)rollValue;	
			if (nextMove.repeatedMove(board, compMove) != 1 && compMove != 0) { // "!= 0" to prevent invalid moves
				nextMove.insertMove(board, compMove, 'o');
				compTurn = false;
			}
		}
		
	}
	
}
