package home_work_9;

public class Ar2 {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] num = {{"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};
        String[][] num1 = {{"3", "3", "3", "3","3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};
        String[][] num2 = {{"3", "3", "3", "g"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};
        System.out.println(doCalc(num1));
        /*try {
            System.out.println(doCalc(num1));
        } catch (ArraySizeException e) {
            e.printStackTrace();
        } finally {
             System.out.println(doCalc(num2));
        }*/
    }

    public static int doCalc(String str[][]) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        if (str.length != 4 & str[0].length != 4) {
            throw new ArraySizeException("Arrays must have 4x4 length.");
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                try {
                    sum += digitSum(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Line " + (i + 1) + " Size " + (j + 1));
                }
            }
        }
        return sum;
    }

    private static int digitSum(String s) {
        return Integer.parseInt(String.valueOf(s));


    }
}
