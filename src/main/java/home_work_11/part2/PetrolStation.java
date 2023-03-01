package home_work_11.part2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class PetrolStation extends Thread implements GasStation {
    private int amount = 100;
    private Semaphore semaphore = new Semaphore(3);
    private int fuel;
    private static final Object lock = new Object();

    public void doRefuel(int fuel) {
        this.fuel = fuel;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + "- Looking for a free gas station");
                try {
                    semaphore.acquire();
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName()
                                + " Petrol amount: " + amount + " Need fuel: " + fuel);
                        if (amount >= fuel) {
                            amount -= fuel;
                            System.out.println(Thread.currentThread().getName()
                                    + " Petrol amount after refueling: " + amount);
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            int random = ThreadLocalRandom.current().nextInt(3000, 10000);
                            sleep(random);
                            System.out.println(Thread.currentThread().getName()
                                    + "- Refueled " + (random / 1000) + " seconds");
                            System.out.println(Thread.currentThread().getName()
                                    + "- Turned up and left.");
                        } else {
                            System.out.println(Thread.currentThread().getName()
                                    + "- " + amount + " liters left at the gas station is not enough for me(((");
                        }
                    }
                    semaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}

