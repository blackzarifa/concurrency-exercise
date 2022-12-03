public class Cleaner implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            while (true) {
                ApplicationState.removeWater();
                System.out.println("Água no balde: "+ApplicationState.getWater() + " ("+Thread.currentThread().getName()+")");
                System.out.println("Água retirada: "+ApplicationState.getTimesRemovedWater());

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
