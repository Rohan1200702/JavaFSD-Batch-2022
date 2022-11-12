package Pattern_printing;

import java.util.Scanner;

public class Left_Star_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int userInput = sc.nextInt();
		int lines, stars;
		for (lines = 1; lines <= userInput; lines++) {
			for (stars = 1; stars <= lines; stars++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
