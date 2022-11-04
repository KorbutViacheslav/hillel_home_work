package home_work_11.part2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class PetrolStation extends Thread implements GasStation {
    private static int amount = 100;
    private Semaphore semaphore=new Semaphore(3);
    private int fuel;

    public synchronized void doRefuel(int fuel) {
        this.fuel = fuel;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "- Looking for a free gas station");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "- Refueling...");
            if (amount >= fuel) {
                amount -=fuel;
                int random = ThreadLocalRandom.current().nextInt(3000, 10000);
                this.sleep(random);
                System.out.println(Thread.currentThread().getName() + "- Refueled " + (random / 1000) + " seconds");
                System.out.println(Thread.currentThread().getName() + "- Turned up and left.");
            } else {
                System.out.println(Thread.currentThread().getName() + "- " + amount + " liters left at the gas station is not enough for me(((");
            }
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

