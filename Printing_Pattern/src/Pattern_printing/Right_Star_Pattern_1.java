package Pattern_printing;
import  java.util.Scanner;

public class Right_Star_Pattern_1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of lines");
			int userInput = sc.nextInt();
			//		int lines,stars, spacePrint;
			////		boolean check = true ;
			//		for(lines = 1; lines <= userInput; lines ++) {
			//			for(spacePrint = userInput - 1; spacePrint >= lines; spacePrint-- ) {
			//				System.out.print(" ");
			//				System.out.print(" ");				
			//			}
			//			for(stars = 1; stars <= lines ; stars++) {
			//				System.out.print("*");
			//				System.out.print(" ");
			//			}
			//			System.out.println();
			//		}

			//------------------------------------ Alternative Method -----------------------------------------------
			//		for(lines = 1; lines <= userInput; lines++) {
			//			int spaceCalculate = userInput - lines;
			//			while(spaceCalculate > 0) {
			//				System.out.print(" ");
			//				System.out.print(" ");
			//				--spaceCalculate;
			//			}
			//			for(stars = 1; stars <= lines; stars++) {
			//
			//				System.out.print("*");
			//				System.out.print(" ");
			//
			//			}	
			//			System.out.println();
			//	}
			//		---------------------------------------Alternative Method-------------------------------------------------------
			//		for(lines =1; lines <= userInput; lines++) {
			//			int spaceTemp = userInput - lines;
			//			for (stars = 1 ; stars <= userInput; stars++) {
			//				if (stars <= spaceTemp) {
			//					check = false;
			//				}
			//				else {
			//					check = true;
			//				}
			//				if (check) {
			//					System.out.print("*");
			//					System.out.print(" ");
			//				}
			//				else {
			//					System.out.print(" ");
			//					System.out.print(" ");
			//				}
			//			}
			//			System.out.println("");
			//		}

			//	-----------------------------------------------------By recursion------------------------------------------------------
			printPattern(userInput, userInput);
		}
	}
	public static void printPattern(int lines, int rows) {
		if (lines == 0)
			return;
		printSpace(lines - 1);
		printAsterik(rows - lines + 1);
		System.out.println();
		printPattern(lines -1, rows);

	}
	public static void printSpace(int lines) {
		if (lines == 0)
			return;
		System.out.print(" ");
		System.out.print(" ");
		printSpace(lines -1);
	}
	public static void printAsterik(int lines) {
		if (lines == 0)
			return;
		System.out.print("*");
		System.out.print(" ");
		printAsterik(lines - 1);
	}

}
