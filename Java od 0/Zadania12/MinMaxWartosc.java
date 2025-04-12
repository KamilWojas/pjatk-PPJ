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
