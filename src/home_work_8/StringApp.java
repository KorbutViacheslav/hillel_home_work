package home_work_8;

public class StringApp {
    public static void main(String[] args) {
        System.out.println("Number of repetitions: " + findSymbolOccurance("hillel", 'l'));
        System.out.println("Result: " + findWordPositio("Hello world", "world"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("ere"));
    }

    public static int findSymbolOccurance(String st, char cha) {
        int c = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == cha) {
                c++;
            }
        }
        return c;
    }

    public static int findWordPositio(String source, String target) {
        int a = source.indexOf(target);
        return a;
    }

    public static String stringReverse(String str) {
        StringBuilder string = new StringBuilder(str);
        System.out.print(string.toString() + "=>");
        StringBuilder reverseStr = string.reverse();
        return reverseStr.toString();
    }

    public static boolean isPalindrome(String str) {
        StringBuilder string = new StringBuilder(str);
        String w = string.toString();
        System.out.print(w + "=>");
        StringBuilder reverseStr = string.reverse();
        String e = reverseStr.toString();
        if (w.equals(e)) {
            return true;
        } else return false;
    }
}
