import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxWartosc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liczby = new ArrayList<>();

        System.out.println("Wpisuj liczby (wpisz '0' aby zakończyć):");
        while (true) {
            int liczba = scanner.nextInt();
            if (liczba == 0) break;
            liczby.add(liczba);
        }

        if (!liczby.isEmpty()) {
            int min = Collections.min(liczby);
            int max = Collections.max(liczby);
            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Największa liczba: " + max);
        } else {
            System.out.println("Nie podano żadnych liczb.");
        }

        scanner.close();
    }
} 