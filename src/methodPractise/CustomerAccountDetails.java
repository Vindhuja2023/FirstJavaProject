package methodPractise;

public class CustomerAccountDetails {

	double accountBalance = 4000.67;

	void withdrawAmountFromATM(int withdrawAmount) {
		if (accountBalance > withdrawAmount) {
			System.out.println("Balance is avilable for withdraw.");
		} else {
			System.out.println("Not enough balance.");
		}
	}

	void nameOfCustomer(String name) {
		System.out.println("Name of customer :" + name);
	}

	void nameAndWithdrawal(String name, int withdrawAmount) {
		System.out.println("Name of customer :" + name);
		if (accountBalance > withdrawAmount) {
			System.out.println("Balance is avilable for withdraw.");
		} else {
			System.out.println("Not enough balance.");
		}
	}
}
