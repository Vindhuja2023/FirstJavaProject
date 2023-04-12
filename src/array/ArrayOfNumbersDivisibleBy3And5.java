package array;

public class ArrayOfNumbersDivisibleBy3And5 {

	int[] number = new int[10];
	int max = 150;

	void ArrayNumbers() {

		for (int i = 0; i < 10;) {
			for (int k = 1; k <=max; k++) {           // k max = 3*5*length of array = 3*5*10=150

				if (k % 3 == 0 && k % 5 == 0) {

					number[i] = k;         
					i++;
				}
				
			}

		}
	}
}
