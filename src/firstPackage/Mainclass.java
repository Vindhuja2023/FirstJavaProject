package firstPackage;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch samsung = new SmartWatch();
		
		samsung.brandName = "Samsung";
		
		samsung.operatingSystem = "Android";
		
		samsung.ram = 1.5;
		
		samsung.screenSize = 1.19;
		
		samsung.isGPSsensorPresent = true;
		
		samsung.isLEDsensorPresent = true;
		
		samsung.displayTime();
		
		samsung.heartrateMonitor();
		
		System.out.println("*******************************************************************");
		
		SmartTV sony = new SmartTV();
		
		sony.brandName = "Sony";
		
		sony.operatingSystem = "Android";
		
		sony.screenSize = 50;
		
		sony.isInternetConnectivityAvailable = true;
		
		sony.watchYoutube();
		
		System.out.println("VINDHUJA");
		
		
		 }

}
