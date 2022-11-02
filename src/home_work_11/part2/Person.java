package home_work_11.part2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Person extends Thread {
    PetrolStation petrolStation;

    Semaphore semaphore;
    int fuelTank;
    String name;

    public Person(int bak, String name) {
        this.fuelTank = bak;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "- Looking for a free gas station");
        try {
            semaphore.acquire();
            if (PetrolStation.getAmount() >= fuelTank) {
                System.out.println(name + "- Refueling...");
                PetrolStation.doRefuel(fuelTank);
                int random = ThreadLocalRandom.current().nextInt(3000, 10000);
                this.sleep(random);
                System.out.println(name + "- Refueled " + (random / 1000) + " seconds");
                System.out.println(name + "- Turned up and left.");
                semaphore.release();
            } else
                System.out.println(name + "- " + PetrolStation.getAmount() + " liters left at the gas station is not enough for me(((");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

