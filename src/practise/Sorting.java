package practise;
import java.util.Scanner;
public class Sorting {

	
	Scanner sc = new Scanner(System.in);
	
	int[] number = new int[10];
	
	void populateArray() {
		
		System.out.println("Enter 10 numbers ");
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
			
		}
	}
	
	void sortArray() {
		
		int swapNumber=0;
		System.out.println("Sorted array in descending order :");
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]<number[j]) {
					swapNumber = number[i];
					number[i] = number[j];
					number[j] = swapNumber;
				}
			}
			System.out.println(number[i]);
		}
	}
}
