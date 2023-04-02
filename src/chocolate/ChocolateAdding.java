package chocolate;

public class ChocolateAdding {
	
	int chocalate=27;
	void addingChocalate() {
		while(chocalate<=63) {
			System.out.println("Number of chocalate inside the box is "+chocalate);
			chocalate+=5;
		}
		if(chocalate>63) {
			System.out.println("The number of chocalate exceeds 63 and it is not allowed");
		}
	}
}
