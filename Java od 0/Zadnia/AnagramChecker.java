import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwsze słowo: ");
        String slowo1 = scanner.nextLine().toLowerCase();

        System.out.print("Podaj drugie słowo: ");
        String slowo2 = scanner.nextLine().toLowerCase();

        boolean wynik = czyAnagram(slowo1, slowo2);

        if (wynik) {
            System.out.println("Słowa są anagramami.");
        } else {
            System.out.println("Słowa NIE są anagramami.");
        }

        scanner.close();
    }

    public static boolean czyAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] znakiA = a.toCharArray();
        char[] znakiB = b.toCharArray();

        Arrays.sort(znakiA);
        Arrays.sort(znakiB);

        return Arrays.equals(znakiA, znakiB);
    }
}