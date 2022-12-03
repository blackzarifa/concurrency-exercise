public class Main {

	public static void main(String[] args) {
		// Program start and end times
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 120*1000; // 120 seconds * 1000 ms

		// Creation of each runnable
		Helper helperRunnable = new Helper();
		Cleaner cleanerRunnable = new Cleaner();

		// Creation of the threads
		Thread helperThread1 = new Thread(helperRunnable);
		Thread helperThread2 = new Thread(helperRunnable);
		Thread helperThread3 = new Thread(helperRunnable);
		Thread cleanerThread = new Thread(cleanerRunnable);

		// Starting the threads
		helperThread1.start();
		helperThread2.start();
		helperThread3.start();
		cleanerThread.start();

		while (true) {
			System.out.print("");

			if (ApplicationState.getWater() < 1 || System.currentTimeMillis() >= endTime) {
				System.out.println("A água foi retirada " + ApplicationState.getTimesRemovedWater() + " vezes.");
				System.exit(0);
			}
		}
	}

}
