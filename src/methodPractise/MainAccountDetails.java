package methodPractise;

//import java.util.Scanner;

public class MainAccountDetails {

	public static void main(String[] args) {

	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawal amount : ");
		int amount = sc.nextInt();
		sc.close();
		CustomerAccountDetails vindhuja = new CustomerAccountDetails();
		vindhuja.nameAndWithdrawal("VINDHUJA", amount);
		// vindhuja.nameOfCustomer("Vindhuja");
		// vindhuja.withdrawAmountFromATM(amount);*/
		ATMWithdrawalWithPIN pin = new ATMWithdrawalWithPIN();
		boolean isPINCorrect = pin.validatePIN(1234);
		if(isPINCorrect) {
		pin.withdrawAmountFromATM(1000);
		}else {
			System.out.println("Invalid PIN");
		}
		
		
	}

}
