public class Helper implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                // Helpers sleeps for 2 seconds if the bucket is full
                if (ApplicationState.getWater() >= 97) {
                    Thread.sleep(2000);
                }

                ApplicationState.putWater();
                System.out.println("Água no balde: "+ApplicationState.getWater() + " ("+Thread.currentThread().getName()+")");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
