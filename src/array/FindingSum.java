package array;

import java.util.Scanner;

public class FindingSum {

	Scanner sc = new Scanner(System.in);

	void findingSumForEvenAndOdd() {
	System.out.println("Enter the length of array : ");
	 int lengthOfArray = sc.nextInt();
	
	 int[] numberArray = new int[lengthOfArray];
	 for(int i =0;i<lengthOfArray;i++) {
	 System.out.println("Enter the element of " + i + "index of the array ");
	 numberArray[i] = sc.nextInt();
	 }
	 int evenSum=0,oddSum=0;
	 for(int i =0;i<lengthOfArray;i++) {
		 
	 
	 if(numberArray[i]%2==0) {
		 evenSum+=numberArray[i];
	 }
	 else {
		 oddSum+=numberArray[i];
	 }
	 }
	 System.out.println("Sum of even numbers : "+evenSum);
	 System.out.println("Sum of odd numbers : "+oddSum);
	 }
}