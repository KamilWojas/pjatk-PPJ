import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortowanieTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile liczb chcesz wprowadzić? ");
        int n = scanner.nextInt();

        Integer[] liczby = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
        }

    }