package assignmentApril13;

public class Pizza {
	int[] price = { 15, 20, 25 };
	int[] pepperoniToppingPrice = { 2, 3, 3 };
	int extraCheesePrice = 1;

	String pizzaSize(String size) {

		return size;

	}

	void smallPizza() {

		int finalBill = price[0] + pepperoniToppingPrice[0] + extraCheesePrice;
		System.out.println("Final bill is " + finalBill);
	}

	void mediumPizza() {

		int finalBill = price[1] + pepperoniToppingPrice[1] + extraCheesePrice;
		System.out.println("Final bill is " + finalBill);
	}

	void largePizza() {

		int finalBill = price[2] + pepperoniToppingPrice[2] + extraCheesePrice;
		System.out.println("Final bill is " + finalBill);
	}
}
