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
