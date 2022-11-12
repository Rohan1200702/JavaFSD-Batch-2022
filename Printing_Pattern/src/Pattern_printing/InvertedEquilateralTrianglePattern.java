package Pattern_printing;
import java.util.Scanner;
public class InvertedEquilateralTrianglePattern {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of lines");
			int noOfLines = sc.nextInt();
			//		int lines,spaces,stars;
			printPattern(noOfLines, noOfLines);
		}
	}
	//		for(lines = 1; lines <= noOfLines; lines++) {
	//			for(spaces = 1; spaces <= lines-1; spaces++  ) {
	//				if(lines != 1) {
	//					System.out.print(" ");
	//					System.out.print(" ");
	//				}
	//			}
	//			for(stars = (noOfLines*2 - 1); stars >= lines*2 - 1; stars--) {
	//				System.out.print("*");
	//				System.out.print(" ");
	//			}
	//			for(spaces = 1; spaces <= lines-1; spaces++  ) {
	//				if(lines != 1) {
	//					System.out.print(" ");
	//					System.out.print(" ");
	//				}
	//			}
	//			System.out.println();
	//		}
	//		-----------------------------------------By using recursion------------------------------------------------------------------------------------
	public static void printPattern(int lines, int rows) {
		if (lines == 0)
			return;
		printSpace(rows - lines);
		printAsterik(lines*2 - 1);
		printSpace(rows - lines);
		System.out.println();
		printPattern(lines -1, rows);

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

