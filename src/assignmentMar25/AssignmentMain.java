package assignmentMar25;

public class AssignmentMain {

	public static void main(String[] args) {
		
		System.out.println("LARGEST NUMBERS");
	
		LargestNumber num = new LargestNumber();
		num.n1 = 5;
		num.n2 = 44;
		num.n3 = 22;
		num.largest();
		
		System.out.println("DISCOUNT");
		
		Discount dis = new Discount();
		dis.price = 8000;
		dis.promo5 = false;
		dis.promo10 = true;
		dis.promo20 = false;
		
		dis.finalPrice();
		
		System.out.println("LICENSE");
		
		License ontarioLicence = new License();
		 ontarioLicence.age = 22;
		 ontarioLicence.g1License = false;
		 ontarioLicence.g2License = true;
		 ontarioLicence.gLicense =  false;
		 ontarioLicence.applyForLicense();
	}

}
