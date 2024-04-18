package assignment4;

import java.util.Scanner;

public class ArrayRead {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter the size of the array: ");
			int size = scanner.nextInt();

			int[] arr = new int[size];

			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < size; i++) {
				System.out.print("Element " + (i + 1) + ": ");
				arr[i] = scanner.nextInt();
			}

			System.out.print("Enter the position to print (1 to " + size + "): ");
			int position = scanner.nextInt();

			System.out.println("Value at position " + position + ": " + arr[position - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error: Invalid position. Please enter a position within the range of the array.");
		} catch (Exception e) {

			System.out.println("An error occurred: " + e.getMessage());
		} finally {

			scanner.close();
		}
	}
}
