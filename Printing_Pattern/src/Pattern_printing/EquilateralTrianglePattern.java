package Pattern_printing;
import java.util.Scanner;
public class EquilateralTrianglePattern {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of lines");
			int noOfLines = sc.nextInt();
			//			int lines,spaces,stars;
			//		for(lines = 1; lines <= noOfLines; lines++) {
			//			for(spaces = noOfLines - 1; spaces >= lines; spaces--  ) {
			//				System.out.print(" ");
			//				System.out.print(" ");
			//			}
			//			for(stars = 1; stars <= lines; stars++) {
			//				System.out.print("*");
			//				System.out.print(" ");
			//			}
			//			for(stars = 2; stars <= lines; stars++) {
			//				System.out.print("*");
			//				System.out.print(" ");
			//			}
			//			for(spaces = noOfLines - 1; spaces >= lines; spaces--  ) {
			//				System.out.print(" ");
			//				System.out.print(" ");
			//			}
			//			System.out.println();
			//		}
			//		------------------------------------------------Alternative Method(Optimal)--------------------------------------------------------
			//			for(lines = 1; lines <= noOfLines; lines++) {
			//				int forwardSpaces = noOfLines - lines;
			//				while( forwardSpaces  > 0) {
			//					System.out.print(" ");
			//					System.out.print(" ");
			//					forwardSpaces--;
			//				}
			//				for(stars = 1; stars <= (lines*2 -1); stars++) {
			//					System.out.print("*");
			//					System.out.print(" ");
			//				}
			//				for(spaces = noOfLines - 1; spaces >= lines; spaces--  ) {
			//					System.out.print(" ");
			//					System.out.print(" ");
			//				}
			//				System.out.println();
			//			}
			//		}
			//		-------------------------------------------------------Recursion method-----------------------------------------------------------
			printStars(noOfLines, noOfLines);
		}
	}
	public static void printStars(int lines, int rows) {
		if (lines == 0)
			return;
		printSpace(lines - 1);
		printAsterik((rows -lines) * 2 + 1);
		printSpace(lines - 1);
		System.out.println();
		printStars(lines-1, rows);
	}
	public static void printSpace(int spaces) {
		if (spaces == 0)
			return;
		System.out.print(" ");
		System.out.print(" ");
		printSpace(spaces -1);
	}
	public static void printAsterik(int lines) {
		if (lines == 0)
			return;
		System.out.print("*");
		System.out.print(" ");
		printAsterik(lines - 1);
	}
}

