package pizza;

public class PizzaBill {
	
String[] pizzaSize = {"Small","Medium","Large"};
	int[] price = {15,20,25};
	int[] pepperoniToppingPrice = {2,3,3};
	int extraCheesePrice = 1;
	
	void displayingPizzaDetails() {
		
		for(int i =0;i<3;i++) {
			System.out.println("The price of "+pizzaSize[i] +" Pizza is $"+price[i] + " and for extra pepperoni topping $"+pepperoniToppingPrice[i]);
		}System.out.println("The price of additional cheese for any size is $" +extraCheesePrice);
		
	}
	
	void bill() {
		int finalBillAmount =0;
		for(int i=0;i<3;i++) {
			if(pizzaSize[i].equals("Medium")) {
		 finalBillAmount = price[i]+pepperoniToppingPrice[i]+extraCheesePrice;
			}}System.out.println("Your final bill is $"+finalBillAmount );
	}
	

}
