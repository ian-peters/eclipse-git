//Test
import java.util.Random;
import java.util.Scanner;

public class computerMove {

	computerMove (){}
	Random random = new Random();
	userMove reUseSwitchinUser= new userMove();
	
	
	public void cpuMove(char[][] board, int move, char X_or_O){
		boolean badMove = true;
		int compMove = 0;
		
		while (badMove) {
			compMove = random.nextInt(9) + 1;
			if(compMove != 0 && compMove != move) {
				reUseSwitchinUser.playerMove(board, compMove, X_or_O);
				badMove = false;
			}
			else {
				compMove = random.nextInt(9) + 1;
			}
			
			
			
			
			
		
		}
		
	
	}
	
	
}
