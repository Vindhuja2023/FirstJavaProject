package assignmentApril13;

import java.util.*;

public class GenaratePizzaBillMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		GeneratePizzaBill pizzaBill = new GeneratePizzaBill();
		System.out.println("Enter the size of Pizza : ");
		String sizeOfPizza = sc.next();
		System.out.println("Do you want to add Pepperoni ? Y/N");
		String pepperoni = sc.next();
		System.out.println("Do you want to add Cheese ? Y/N");
		String cheese = sc.next();
		sc.close();
		pizzaBill.selectPizzaSize(sizeOfPizza);
		pizzaBill.isPepperoniNeed(pepperoni, sizeOfPizza);
		pizzaBill.isCheeseNeed(cheese);
		pizzaBill.finalBill();

	}
}
