package firstPackage;

public class SmartWatch {
	
String brandName;

int modelNumber;

String operatingSystem; 

double ram;

double screenSize;
	
boolean isGPSsensorPresent;

boolean isLEDsensorPresent;
	
void displayTime() {
	
	System.out.println("displaying time from "+ brandName +" smart watch");
	
   }

void heartrateMonitor() {
	
	System.out.println("displaying heartrate monitered if LEDsensor is present. LEDsensor present :"+isLEDsensorPresent);
}

}
