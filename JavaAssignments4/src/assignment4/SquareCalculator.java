package assignment4;
import java.util.Scanner;

public class SquareCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			String input = scanner.nextLine();

			double number = Double.parseDouble(input);

			double square = number * number;

			System.out.println("Square value of " + number + " is: " + square);
		} catch (NumberFormatException e) {

			System.out.println("Error: Please enter a valid number.");
		} finally {

			scanner.close();
		}
	}
}
