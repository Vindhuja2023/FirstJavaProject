package practise;

import java.util.Scanner;

public class EvenAndOdd {
	Scanner sc = new Scanner(System.in);
	int[] numbers = new int[10];

	void populateArray() {

		System.out.println("Enter 10 integer numbers :");

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = sc.nextInt();

		}
	}

	void evenAndOddNumbers() {
		System.out.println("Even numbers are : ");
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0)
				System.out.println(numbers[i]);
		}
		System.out.println("Odd numbers are : ");
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 != 0)
				System.out.println(numbers[i]);
		}
	}

}
