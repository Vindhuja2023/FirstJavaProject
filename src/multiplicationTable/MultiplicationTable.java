package multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {

	int number;
	Scanner num = new Scanner(System.in);

	void multiplicationTable() {

		System.out.println("Enter the number to display multiplication table   : ");
		number = num.nextInt();
		num.close();
		System.out.println("Multiplication table of " + number);
		for (int counter = 1; counter <= 10; counter++) {

			int product = number * counter;

			System.out.println(number + "*" + counter + "=" + product);

		}
	}
}
