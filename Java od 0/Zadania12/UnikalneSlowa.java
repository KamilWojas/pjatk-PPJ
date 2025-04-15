import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnikalneSlowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst (kilka zdań):");
        String tekst = scanner.nextLine().toLowerCase();

        String[] slowa = tekst.replaceAll("[^a-ząćęłńóśźż0-9\\s]", "")
                .split("\\s+");

        Set<String> unikalne = new TreeSet<>();

        for (String slowo : slowa) {
            if (!slowo.isEmpty()) {
                unikalne.add(slowo);
            }
        }

        System.out.println("\nLiczba wszystkich słów: " + slowa.length);
        System.out.println("Liczba unikalnych słów: " + unikalne.size());
        System.out.println("Unikalne słowa (alfabetycznie):");
        for (String s : unikalne) {
            System.out.println("- " + s);
        }

        scanner.close();
    }
}