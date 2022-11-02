package home_work_11.part2;

public class PetrolStation implements GasStation {
    private static int amount = 100;

    public static int getAmount() {
        return amount;
    }

    public static void doRefuel(int petrolValue) {
        amount -= petrolValue;
    }

}

