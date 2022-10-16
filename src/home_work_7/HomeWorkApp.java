package home_work_7;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(summTrue(5, 16));
        positiveNum(-5);
        System.out.println(positiveNumBool(5));
        stringFor("Hello JAVA", 2);
        System.out.println(leapYear(2022));
    }

    public static void printThreeWords() {
        System.out.println("Apple" + "\nOrange" + "\nBanana" + "\nApple");
    }

    public static void checkSumSign() {
        int a = -6;
        int b = 4;
        if (a + b >= 0) System.out.println("Summa is positive.");
        else System.out.println("Summa is negative.");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) System.out.println("Red");
        else if (value >= 0 && value <= 100) System.out.println("Yellow");
        else if (value > 100) System.out.println("Green");
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 6;
        if (a > b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static boolean summTrue(int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            return true;
        else
            return false;
    }

    public static void positiveNum(int a) {
        if (a >= 0) System.out.println("Positive number.");
        else System.out.println("Negative number");
    }

    public static boolean positiveNumBool(int a) {
        if (a >= 0) return true;
        else return false;
    }

    public static void stringFor(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    private static boolean leapYear(int a) {
        boolean b = (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
        if (b == true) return true;
        else return false;
    }
}