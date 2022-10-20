package home_work_8;

public class NewApple {
    public static void main(String[] args) {
        String sekret = "apple";
        String otvet = "appllll";
        StringBuilder podskazkaTablicka = new StringBuilder("###############");
        printPodskazka(sekret, otvet, podskazkaTablicka);
        System.out.println(podskazkaTablicka);

    }
    private static StringBuilder printPodskazka(String sekret, String otvet, StringBuilder podskazkaTablicka) {
        int minZnachenn = Math.min(otvet.length(), sekret.length());
        for (int i = 0; i < minZnachenn; i++) {
            if (sekret.charAt(i) == otvet.charAt(i)) {
                podskazkaTablicka.setCharAt(i, sekret.charAt(i));
            }
        }
        return podskazkaTablicka;
    }
}
