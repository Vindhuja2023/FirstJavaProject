package practise;

import java.util.Scanner;

public class MaxMin {

	Scanner sc = new Scanner(System.in);

	int[] number = new int[10];

	void populateArray() {
		System.out.println("Enter 10 numbers : ");
		for (int i = 0; i < number.length; i++) {

			number[i] = sc.nextInt();
		}
	}

	void maxMin() {
		int max = number[0];
		for (int i = 1; i < number.length; i++) {

			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("Max number is " + max);

		int min = number[0];
		for (int i = 1; i < number.length; i++) {

			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("Min number is " + min);

	}
}
