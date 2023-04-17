package assignmentApril13;

public class GeneratePizzaBill {

	int price;

	void selectPizzaSize(String size) {
		if (size.equals("Small")) {
			price = 15;
		} else if (size.equals("Medium")) {
			price = 20;

		} else if (size.equals("Large")) {
			price = 25;
		}

	}

	void isPepperoniNeed(boolean addPepperoni, String size) {
		if (addPepperoni && size.equals("Small")) {
			price += 2;
		} else if (addPepperoni && (size.equals("Medium") || size.equals("Large"))) {
			price += 3;

		}

	}

	void isCheeseNeed(boolean addCheese) {
		if (addCheese) {
			price += 1;
		}

	}

	void finalBill() {
		System.out.println("Your final bill amount is $" + price);
	}
}
