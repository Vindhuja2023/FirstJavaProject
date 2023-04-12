package practise;

import java.util.Scanner;

public class PrimeCheck {

	Scanner sc = new Scanner(System.in);

	int[] number = new int[10];

	void populateArray() {
		System.out.println("Enter 10 numbers : ");
		for (int i = 0; i < number.length; i++) {

			number[i] = sc.nextInt();
		}
	}

	void primeCheck() {

		System.out.println("Prime numbers are");
		for (int i = 0; i < number.length; i++) {
			int count = 0;
			for (int j = 1; j <= number[i]; j++) {
				if (number[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(number[i]);

			}
		}

	}
}
