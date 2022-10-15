import java.util.Scanner;
public class Operators {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            float result;

            result = num1 + num2;
            System.out.println("Addition = " + result );
            result = num1 - num2;
            System.out.println("Subtraction = " + result );
            result = num1 * num2;
            System.out.println("Multplication = " + result );
            result = num1 / num2;
            System.out.println("Division = " + result );

    }
}
