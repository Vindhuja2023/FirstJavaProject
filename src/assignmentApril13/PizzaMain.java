package assignmentApril13;

public class PizzaMain {

	public static void main(String[] args) {

		Pizza pizza = new Pizza();
		String sizeValue = "Large";
		String size = pizza.pizzaSize(sizeValue);

		if (size.equals("Small")) {
			pizza.smallPizza();
		} else if (size.equals("Medium")) {
			pizza.mediumPizza();
		} else if (size.equals("Large")) {
			pizza.largePizza();
		} else {
			System.out.println("The entered size of pizza is not available");
		}

	}

}
