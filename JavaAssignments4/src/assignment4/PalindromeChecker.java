package assignment4;

public class PalindromeChecker {
	public static boolean isPalindrome(String str) {

		str = str.toLowerCase();

		str = str.replaceAll("[^a-zA-Z0-9]", "");

		int length = str.length();

		if (length <= 1) {
			return true;
		}

		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String input1 = "Madam";
		String input2 = "Hello";

		System.out.println(input1 + " is a palindrome? " + isPalindrome(input1));
		System.out.println(input2 + " is a palindrome? " + isPalindrome(input2));
	}
}
