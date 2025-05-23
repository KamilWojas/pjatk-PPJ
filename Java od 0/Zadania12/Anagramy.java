import java.util.Arrays;
import java.util.Scanner;

public class Anagramy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwsze słowo: ");
        String slowo1 = scanner.nextLine().toLowerCase();

        System.out.print("Podaj drugie słowo: ");
        String slowo2 = scanner.nextLine().toLowerCase();

        if (czyAnagram(slowo1, slowo2)) {
            System.out.println("Słowa \"" + slowo1 + "\" i \"" + slowo2 + "\" są anagramami.");
        } else {
            System.out.println("Słowa \"" + slowo1 + "\" i \"" + slowo2 + "\" nie są anagramami.");
        }

        scanner.close();
    }
    public static boolean czyAnagram(String slowo1, String slowo2) {
        if (slowo1.length() != slowo2.length()) {
            return false;
        }

        char[] tablica1 = slowo1.toCharArray();
        char[] tablica2 = slowo2.toCharArray();
        Arrays.sort(tablica1);
        Arrays.sort(tablica2);

        return Arrays.equals(tablica1, tablica2);
    }
}