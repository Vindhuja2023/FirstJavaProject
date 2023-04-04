package waterTank;

public class TankFilling {

	void WaterTankFilling() {
		int tankCapacity = 100;
		int currentLevel = 6;

		while (currentLevel <= tankCapacity) {
			System.out.println("The waterlevel in tank is " + currentLevel);

			if (currentLevel > 90 && currentLevel < 100) {

				int finalLevel = (tankCapacity - currentLevel) + currentLevel;
				System.out.println("The waterlevel in tank is " + finalLevel);

			}
			currentLevel += 10;

			if (currentLevel > tankCapacity) {
				System.out.println("Tank reached it's maximum level,stop tank filling or it will overflow");

			}
		}
	}
}
