package FirstPackage;

/**
 * This class is a demo class to check 
 * and understand the usage of comments 
 */
import java.util.Scanner;

public class AllOperationWithComment {
	public static void main(String[] args) {
		try (// Creating object of class Scanner to take input from user
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two numbers");
			// Declaring variables to store inputs from user
			float num1 = sc.nextFloat(), num2 = sc.nextFloat();
			System.out.println("Enter your prefered operation symbol(+,-,/,*)");
			char operationSymbol = sc.next().charAt(0);
			// Calling method Operations to complete the arithmetic operations
			operations(operationSymbol, num1, num2);
		}

	}

	/*
	 * This method is created to perform all the arithmetic as well relational
	 * operations
	 */
	static void operations(char symbol, float num1, float num2) {
		float num3;
		if (symbol == '+') {
			if (num1 != 0.0f && num2 != 0.0f) {
				num3 = num1 + num2;
				System.out.printf("Addition = %f", num3);
			}
		} else if (symbol == '-') {
			num3 = (num1 > num2) ? (num1 - num2) : (num2 - num1);
			System.out.printf("\nSubtraction = %f", num3);
		} else if (symbol == '/') {
			num3 = (num2 == 0) ? 0 : (num1 / num2);
			System.out.println("\nDivision = " + num3);
		} else if (symbol == '*') {
			num3 = num1 * num2;
			System.out.println("Multiplication = " + num3);
		}
	}
}