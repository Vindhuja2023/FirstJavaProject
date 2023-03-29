package assignmentMar25;

public class Discount {

	double price;
	boolean promo5;
	boolean promo10;
	boolean promo20;
	double promoAppliedPrice;
	double finalPrice;

	void finalPrice() {
		double discountPrice = price * 0.5;
		System.out.println("50% discount applied is :" + discountPrice);

		if (promo5) {
			promoAppliedPrice = discountPrice * 0.05;
			finalPrice = discountPrice - promoAppliedPrice;
			System.out.println("Final price after applying promocode is: " + finalPrice);
		} else if (promo10) {
			promoAppliedPrice = discountPrice * 0.1;
			finalPrice = discountPrice - promoAppliedPrice;
			System.out.println("Final price after applying promocode is: " + finalPrice);
		} else if (promo20) {
			promoAppliedPrice = discountPrice * 0.2;
			finalPrice = discountPrice - promoAppliedPrice;
			System.out.println("Final price after applying promocode is: " + finalPrice);
		} else {
			finalPrice = discountPrice;
			System.out.println("Final price without applying promocode is: " + finalPrice);
		}

	}
}