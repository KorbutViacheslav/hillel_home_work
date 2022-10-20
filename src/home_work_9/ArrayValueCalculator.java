package home_work_9;

public class ArrayValueCalculator {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
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
        System.out.println("Summa numbers in array: " + doCalc(numbersIncorrectValue));
    }

    public static int doCalc(String numbersString[][]) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        if (isCorrectmassive(numbersString, 4, 4)) {
            for (int i = 0; i < numbersString.length; i++) {
                for (int j = 0; j < numbersString[0].length; j++) {
                    try {
                        sum += Integer.parseInt(numbersString[i][j]);
                    } catch (Exception e) {
                        throw new ArrayDataException("Incorrect value in " + "Line: №" + (i + 1) + " Colum: №" + (j + 1));
                    }
                }
            }
        } else throw new ArraySizeException("Arrays must have 4x4 size.");

        return sum;
    }

    public static boolean isCorrectmassive(String[][] s, int col, int row) {
        if (s.length != col)
            return false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length != row) {
                return false;
            }
        }
        return true;
    }
}
