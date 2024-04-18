package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter a number: ");
			String input = scanner.next();

			int number = parseInt(input);

			System.out.println("Converted integer: " + number);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: Non-digit input detected.");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException: Non-integer input detected.");
		} finally {
			scanner.close();
		}
	}

	public static int parseInt(String input) {

		if (!input.matches("\\d+")) {
			throw new NumberFormatException();
		}

		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("NumberFormatException: Input is too large to be stored in an integer.");
		}
	}
}
