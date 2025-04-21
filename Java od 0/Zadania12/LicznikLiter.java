import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LicznikLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Wpisz tekst: ");
        String tekst = scanner.nextLine().toLowerCase();

        Map<Character, Integer> mapa = new HashMap<>();

        for (char c : tekst.toCharArray()) {
            if (Character.isLetter(c)) {
                mapa.put(c, mapa.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("\nCzęstość występowania liter:");
        for (char litera = 'a'; litera <= 'z'; litera++) {
            int ile = mapa.getOrDefault(litera, 0);
            System.out.println(litera + " – " + ile + " raz(y)");
        }

        scanner.close();
    }
}