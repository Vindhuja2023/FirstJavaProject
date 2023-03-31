package loopPackage;

public class LoopMain {

	public static void main(String[] args) {
		
		System.out.println("Displaying result of table 2");
		PrintTableOf2 multiple = new PrintTableOf2();
		multiple.number = 2;
		multiple.counterNumber = 1;
		multiple.printMultiplies();
		
		System.out.println("Printing numbers from 1 to 10");
		DoWhileDemo doWhile = new DoWhileDemo();
		doWhile.number = 1;
		doWhile.print10Numbers();

	}

}
