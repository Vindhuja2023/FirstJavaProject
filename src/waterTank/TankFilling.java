package waterTank;

public class TankFilling {

	int tankCapacity;

	void WaterTankFilling() {

		int level = 0;

		while (level <= tankCapacity) {
			System.out.println("The waterlevel in tank is " + level);
			level += 10;
		}
		if (level > tankCapacity) {
			System.out.println("Tank reached it's maximum level,stop tank filling or it will overflow");

		}
	}
}
