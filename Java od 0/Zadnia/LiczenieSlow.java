import java.util.*;

public class LiczenieSlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");
        String zdanie = scanner.nextLine().toLowerCase();

        String[] slowa = zdanie.split("\\s+"); 
        Map<String, Integer> licznik = new HashMap<>();

        for (String slowo : slowa) {
            licznik.put(slowo, licznik.getOrDefault(slowo, 0) + 1);
        }

        System.out.println("Wystąpienia słów:");
        for (Map.Entry<String, Integer> entry : licznik.entrySet()) {
            System.out.println(entry.getKey() + " – " + entry.getValue() + " razy");
        }

        scanner.close();
    }
}