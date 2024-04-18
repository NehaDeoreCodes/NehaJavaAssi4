package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter two numbers : ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			Calculator obj1 = new Calculator(num1, num2);

			System.out.println("Addition: " + obj1.add());

			System.out.println("Subtraction: " + obj1.subtract());

			System.out.println("Multiplication: " + obj1.multiply());

			System.out.println("Division: " + obj1.divide());

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch Exception: Non-integer input detected.");
		} finally {
			scanner.close();
		}

	}
}


	
