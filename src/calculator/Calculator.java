package calculator;

public class Calculator {
	int num1;
	int num2;

	void sumOfNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void differenceOfNumbers() {
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void productOFNumbers() {
		int product = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
	}

	void divisionOfNumbers() {
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}

	void squareOfTheNumber() {
		int square1 = num1 * num1;
		System.out.println("Square of " + num1 + " is " + square1);
		int square2 = num2 * num2;
		System.out.println("Square of " + num2 + " is " + square2);
	}

	void cubeOfTheNumber() {
		int cube1 = num1 * num1 * num1;
		System.out.println("Cube of " + num1 + " is " + cube1);
		int cube2 = num2 * num2 * num2;
		System.out.println("Cube of " + num2 + " is " + cube2);
	}
}
