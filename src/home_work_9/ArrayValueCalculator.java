package home_work_9;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String numbers[][] = {{"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};
        String numbersIncorrectValue[][] = {{"3", "3", "3", "g"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};
        String numbersIncorrectSize[][] = {{"3", "3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};
        System.out.println("Summa numbers in array: " + doCalc(numbers));
        System.out.println("Trying to display the wrong value of the array:");
        try {
            System.out.println("Summa numbers in array: " + doCalc(numbersIncorrectValue));
        } catch (ArrayDataException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Summa numbers in array: " + doCalc(numbersIncorrectSize));
        }
    }

    public static int doCalc(String numbersString[][]) throws ArraySizeException {
        int[][] numbersInteger = new int[numbersString.length][numbersString[0].length];
        int sum = 0;
        if (numbersString.length == 4 && numbersString[0].length == 4) {
            for (int i = 0; i < numbersString.length; i++) {
                for (int j = 0; j < numbersString[0].length; j++) {
                    try {
                        numbersInteger[i][j] = digitSum(numbersString[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Incorrect value in " + "Line: №" + (i + 1) + " Colum: №" + (j + 1));
                    }
                    sum += numbersInteger[i][j];
                }
            }
        } else throw new ArraySizeException("Arrays must have 4x4 size.");

        return sum;
    }

    private static int digitSum(String s) {
        return Integer.parseInt(String.valueOf(s));
    }
}
