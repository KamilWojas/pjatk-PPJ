import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NajczestszaLitera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine().toLowerCase();

        Map<Character, Integer> licznik = new HashMap<>();

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) {
                licznik.put(znak, licznik.getOrDefault(znak, 0) + 1);
            }
        }

        char najczestszy = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> entry : licznik.entrySet()) {
            if (entry.getValue() > max) {
                najczestszy = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println("Najczęściej występująca litera: '" + najczestszy + "' (" + max + " razy)");

        scanner.close();
    }
}