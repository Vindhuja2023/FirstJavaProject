package assignmentMar30;

import java.util.Scanner;

public class ForLoopDemo {

	int actualPIN;
	int enterPIN;
	int withdrawAmount;
	int availableBalance;
	Scanner sc = new Scanner(System.in);

	void checkATMCardisworking() {
		int counter;

		for (counter = 1; counter <= 3; counter++) {
			System.out.println("Enter the PIN");
			enterPIN = sc.nextInt();
			System.out.println("Enter the withdraw amount");
			withdrawAmount = sc.nextInt();

			if (enterPIN == actualPIN && withdrawAmount < availableBalance) {
				System.out.println("The entered PIN is correct and balance available for withdrawal");

				System.out.println("The amount withdrawn is : " + withdrawAmount);
				break;
			} else {
				System.out.println("The entered PIN is incorrect or you don't have available balance");

			}
		}
		if (counter >= 4)

		{
			System.out.println("You have exceeded the limit for entering the pin,card is blocked ");

		}
	}
}