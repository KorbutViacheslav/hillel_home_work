package home_work_11;

public class ValueCalculator {
    private double[] mainArray;
    private int size = 1_000_000;
    private int halfSize = size / 2;

    public void doCalc() throws InterruptedException {
        long start = System.currentTimeMillis();
        mainArray = new double[size];
        double[] firstHalfArray = new double[halfSize];
        double[] secondHalfArray = new double[halfSize];
        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = 1.0;
        }
        System.arraycopy(mainArray, 0, firstHalfArray, 0, halfSize);
        System.arraycopy(mainArray, halfSize, secondHalfArray, 0, halfSize);
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                calculateNewValue(firstHalfArray);
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                calculateNewValue(secondHalfArray);
            }
        });
        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.arraycopy(firstHalfArray, 0, mainArray, 0, halfSize);
        System.arraycopy(secondHalfArray, 0, mainArray, halfSize, halfSize);
        long finish = System.currentTimeMillis();
        System.out.println("Method running time: " + (finish - start) + " milliseconds");

    }

    private void calculateNewValue(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= (float) Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2);
        }
    }
}