package calculator;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		String operation;
		Calculator calculator = new Calculator();
		calculator.num1 = 10;
		calculator.num2 = 4;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation ");
		operation = sc.next();

		switch (operation) {
		case "add":
			calculator.sumOfNumbers();
			break;
		case "subtract":
			calculator.differenceOfNumbers();
			break;
		case "multiply":
			calculator.productOFNumbers();
			break;
		case "divide":
			calculator.divisionOfNumbers();
			break;
		case "square":
			calculator.squareOfTheNumber();
			break;
		case "cube":
			calculator.cubeOfTheNumber();
			break;
		default:
			System.out.println("Invalid Operation");
		}

	}
}
