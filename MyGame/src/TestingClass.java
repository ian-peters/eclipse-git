import java.util.Random;

public class TestingClass {
	
	public static void main(String[] args) {
		Random rand = new Random();
		boolean test = true;
		int aftervalue;
		
		while(test) {
			double startingValue = (Math.random()+0.1) * 9;
			aftervalue = (int)startingValue;
			if (aftervalue == 10) {
				test = false;
				
			}
			else {
				System.out.print(aftervalue);
			}
		}
		
		double startingValue = (Math.random()+0.1) * 9; 
		System.out.println((int)startingValue);
		
		//int compMove = rand.nextInt(9) + 1;
		//System.out.println(compMove);
		
	}

}
