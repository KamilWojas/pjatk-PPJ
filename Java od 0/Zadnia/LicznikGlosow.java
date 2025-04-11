import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LicznikGlosow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> glosy = new HashMap<>();

        System.out.println("Wpisuj imiona, aby oddać głos (wpisz 'koniec', aby zakończyć):");

        while (true) {
            System.out.print("Głos na: ");
            String imie = scanner.nextLine().trim();

            if (imie.equalsIgnoreCase("koniec")) break;

            glosy.put(imie, glosy.getOrDefault(imie, 0) + 1);
        }

        System.out.println("\nWyniki głosowania:");
        for (Map.Entry<String, Integer> entry : glosy.entrySet()) {
            System.out.println(entry.getKey() + " – " + entry.getValue() + " głos(y)");
        }

        String zwyciezca = null;
        int maxGlosy = 0;

        for (Map.Entry<String, Integer> entry : glosy.entrySet()) {
            if (entry.getValue() > maxGlosy) {
                zwyciezca = entry.getKey();
                maxGlosy = entry.getValue();
            }
        }