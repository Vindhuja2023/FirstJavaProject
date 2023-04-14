package methodPractise;

public class ATMWithdrawalWithPIN {

	
	int actualPIN = 1234;
	
	double accountBalance = 4000.67;

	void withdrawAmountFromATM(int withdrawAmount) {
		if (accountBalance > withdrawAmount) {
			System.out.println("Balance is avilable for withdraw.");
		} else {
			System.out.println("Not enough balance.");
		}
	}
	
	boolean validatePIN(int enteredPIN) {
		boolean isPINCorrect = false;
		for(int i=0;i<3;i++) {
			if(enteredPIN==actualPIN) {
				isPINCorrect = true;
			
			}
		} return isPINCorrect;
	}
}
