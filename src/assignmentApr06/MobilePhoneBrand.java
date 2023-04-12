package assignmentApr06;

import java.util.Scanner;

public class MobilePhoneBrand {

	boolean samsung;
	boolean google;
	boolean apple = true;

	String[] samsungPhone = { "S20", "S21", "Flip3", "Fold3" };

	String[] googlePhone = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };

	String[] applePhone = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11Pro" };

	void displyMobileName() {

		if (samsung) {
			System.out.println("The available products in Samsung brand are ");
			for (int i = 0; i < samsungPhone.length; i++) {

				System.out.println(samsungPhone[i]);
			}
		} else if (google) {
			System.out.println("The available products in Google brand are ");
			for (int i = 0; i < googlePhone.length; i++) {
				System.out.println(googlePhone[i]);
			}
		} else if (apple) {
			System.out.println("The available products in Apple brand are ");
			for (int i = 0; i < applePhone.length; i++) {
				System.out.println(applePhone[i]);
			}
		}

	}

	Scanner sc = new Scanner(System.in);

	void searchProduct() {

		System.out.println("Enter the name of the mobile  displayed to check availability : ");

		String product = sc.next();
		int matchingCount = 0;

		if (samsung) {

			for (int i = 0; i < samsungPhone.length; i++) {

				if (samsungPhone[i].equals(product)) {
					matchingCount = 1;

				}

			}
			if (matchingCount == 1) {
				System.out.println("Product selected is : " + product);
			} else {
				System.out.println("Please select a product from the list.");
			}
		} else if (google) {

			for (int i = 0; i < googlePhone.length; i++) {

				if (googlePhone[i].equals(product)) {
					matchingCount = 1;

				}
			}
			if (matchingCount == 1) {
				System.out.println("Product selected is : " + product);
			} else {
				System.out.println("Please select a product from the list.");
			}

		}

		else if (apple) {

			for (int i = 0; i < applePhone.length; i++) {

				if (applePhone[i].equals(product)) {

					matchingCount = 1;
				

				}
			}
			if (matchingCount == 1) {
				System.out.println("Product selected is : " + product);
			} else {
				System.out.println("Please select a product from the list");
			}
		}
	}

}
