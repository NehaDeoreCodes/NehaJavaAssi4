package assignment4;

import java.util.StringTokenizer;

public class StringSplitter {
	public static void main(String[] args) {

		String input = "Hello World";

		try {

			StringTokenizer tokenizer = new StringTokenizer(input, " ");

			String word1 = tokenizer.nextToken();
			String word2 = tokenizer.nextToken();
			String word3 = tokenizer.nextToken();

			System.out.println("First word: " + word1);
			System.out.println("Second word: " + word2);
			System.out.println("Third word: " + word3);

		} catch (Exception e) {

			System.out.println("Error: Input string does not contain two words.");
		}
	}
}
