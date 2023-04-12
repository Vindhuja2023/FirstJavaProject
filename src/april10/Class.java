package april10;

public class Class {

	int[] number = { 1, 2, 4, 6, 8 };

	void min() {
		int minimum = number[0];

		for (int i = 1; i < number.length; i++) {

			if (number[i] < minimum) {
				minimum = number[i];
			}

		}
		System.out.println("Smallest number in given number is : " + minimum);
	}

}
