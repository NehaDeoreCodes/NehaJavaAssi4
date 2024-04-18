package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
	private int num1;
	private int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both numbers should be positive for addition.");
		}
		return num1 + num2;
	}

	public int subtract() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both numbers should be positive for subtraction.");
		}
		return num1 - num2;
	}

	public int multiply() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Both numbers should not be zero for multiplication.");
		}
		return num1 * num2;
	}

	public int divide() {
		if (num2 == 0) {
			throw new ArithmeticException("Second number should not be zero for division.");
		}
		return num1 / num2;
	}
}

		