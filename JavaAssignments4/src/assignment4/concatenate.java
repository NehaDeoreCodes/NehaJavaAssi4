package assignment4;

import java.util.Arrays;

public class concatenate {

	public static void main(String[] args) {
		String[] stringArray = { " Hello ", " PGdac ", " Welcome to Java", " Programming Language" };
		System.out.println("Original String Array: " + arrayToString(stringArray));
		System.out.println("Concatenated String: " + concatenateWithStringBuilder(stringArray));
	}

	private static String concatenateWithStringBuilder(String[] stringArray) {
		StringBuilder sb = new StringBuilder();
		for (String str : stringArray) {
			sb.append(str);
		}
		return sb.toString();
	}

	private static String arrayToString(String[] stringArray) {
		return Arrays.toString(stringArray);

	}

}
