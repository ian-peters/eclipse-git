import java.util.Scanner;

public class TestingClass {
	
	
	//Print multiplication tables 1 to 100
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
	}
}
		/*int outer = 1;
		int inner = 1;
		
		while (outer <= 10) {
			inner = 1;
			while (inner <= 10) {
			    System.out.println(outer + " x " + inner + " = " + (inner * outer));
			    inner = inner + 1;
			}
		outer = outer +1;
		}
	
	}*/


	/*	
		int[] myArray =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.print(" " + myArray);
		
		
		for (int i = 0; i < 6; i++) {
			System.out.print(" " + myArray[i]);
		//	for (int j = 0; j < 6; j++) {
			
		}
		
	}

}*/
