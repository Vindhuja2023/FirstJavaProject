package primeNumber;

import java.util.Scanner;

public class PrimeCheck {

	int inputNumber;
	Scanner sc = new Scanner(System.in);

	void checkTheNumber() {

		System.out.println("Enter a positive integer value ");
		inputNumber = sc.nextInt();
		if (inputNumber > 0) {
			System.out.println("Entered number is positive integer " + inputNumber);
			if (inputNumber == 1) {
				System.out.println(inputNumber + "is not a prime number");
			} else {
				int remainderZeroCount = 0;
				for (int count = 1; count <= inputNumber; count++) {
					if (inputNumber % count == 0) {
						remainderZeroCount++;

					}
				}
				if (remainderZeroCount == 2) {
					System.out.println(inputNumber + " is a prime number.");
				} else {
					System.out.println(inputNumber + " is not a prime number.");
				}

			}

		} else if (inputNumber == 0) {
			System.out.println(
					"Entered number is 0,it can not be consider to a positive number nor to be a prime number.");
		} else {
			System.out.println("Entered number is negative integer");
		}

	}
}
