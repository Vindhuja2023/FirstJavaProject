package assignmentMar30;

import java.util.Scanner;

public class ForLoopDemo {

	int actualPIN;
	int enterPIN;
	int availableBalance;
	int withdrawAmount;
	Scanner sc = new Scanner(System.in);

	void checkATMCardCanWithdrawMoney() {
		int counter;

		for (counter = 1; counter <= 3; counter++) {
			System.out.println("Enter the PIN");
			enterPIN = sc.nextInt();
			if (enterPIN == actualPIN) {
				System.out.println("Entered PIN is correct ");
						System.out.println("Enter the withdrawal amount: ");
						 withdrawAmount = sc.nextInt();
						 if(withdrawAmount < availableBalance) {
				
				System.out.println("Balance available for withdrawal");

				System.out.println("The amount withdrawn is : " + withdrawAmount);
				break;
				}else {
					System.out.println("Balance is not available for withdrawal,try again");
					System.out.println("Available balance is "+availableBalance);

				}
			} else {
				System.out.println("The entered PIN is incorrect ,try again with valid PIN");
				
				}}
		
		if (counter >= 4)

		{
			System.out.println("You have exceeded the limit for entering the pin,card is blocked ");

		}
	}
}