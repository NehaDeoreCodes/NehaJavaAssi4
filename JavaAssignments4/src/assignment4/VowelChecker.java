package assignment4;

public class VowelChecker {
	public static void main(String[] args) {
		String input1 = "Hello";
		String input2 = "Rhythm";

		try {
			checkForVowels(input1);
			System.out.println("String '" + input1 + "' contains vowels.");

			checkForVowels(input2);
			System.out.println("String '" + input2 + "' contains vowels.");
		} catch (NoVowelsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void checkForVowels(String str) throws NoVowelsException {

		String lowerCaseStr = str.toLowerCase();

		if (!lowerCaseStr.matches(".*[aeiou].*")) {
			throw new NoVowelsException("The string does not contain any vowels.");
		}
	}
}

class NoVowelsException extends Exception {
	public NoVowelsException(String message) {
		super(message);
	}
}
