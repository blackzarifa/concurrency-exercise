
public class ApplicationState {
	private static int timesRemovedWater = 0;
	public static int getTimesRemovedWater() {
		return timesRemovedWater;
	}

	private static int bucket = 0;
	public static void removeWater() {
			bucket -= 10;
			timesRemovedWater++;
	}
	public static void putWater() {
		if (bucket <= 97) {
			bucket += 3;
		}
	}
	public static int getWater() {
		return bucket;
	}
}
