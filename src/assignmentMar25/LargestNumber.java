package assignmentMar25;

public class LargestNumber {

	int n1;
	int n2;
	int n3;

	void largest() {

		if (n1 > n2 && n1 > n3) {
			System.out.println("largest number among given numbers is :" + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("largest number among given numbers is :" + n2);
		} else {
			System.out.println("largest number among given numbers is :" + n3);
		}
	}
}
