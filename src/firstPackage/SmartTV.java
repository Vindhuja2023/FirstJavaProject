package firstPackage;

public class SmartTV {

	String brandName;
	
	String operatingSystem;
	
	int screenSize;
	
	boolean isInternetConnectivityAvailable;
	
	void watchYoutube() {
		System.out.println("displaying youtube if internet connectvity is available. Internet connectivity available : "+ isInternetConnectivityAvailable);
	}

}
