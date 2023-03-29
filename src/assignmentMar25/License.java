package assignmentMar25;

public class License {

	int age;
	boolean g1License;
	boolean g2License;
	boolean gLicense;

	void applyForLicense() {
		if (age >= 18) {
			if (g1License) {
				System.out.println("You are eligible for applying G2 License.");
			} else if (g2License) {
				System.out.println("You are eligible for applying G License.");
			} else if (gLicense) {
				System.out.println("You have already got G License.");
			} else {
				System.out.println("You are 18+ and eligible for applying Ontario driving license .");
			}

		}

		else

		{
			System.out.println("License can not be issued since applicant is minor.");
		}
	}
}
