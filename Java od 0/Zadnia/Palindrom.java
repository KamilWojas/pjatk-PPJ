import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        if (czyPalindrom(tekst)) {
            System.out.println("Tekst \"" + tekst + "\" jest palindromem.");
        } else {
            System.out.println("Tekst \"" + tekst + "\" nie jest palindromem.");
        }

        scanner.close();
    }

    public static boolean czyPalindrom(String tekst) {
        
        String czystyTekst = tekst.replaceAll("\\s+", "").toLowerCase();
        String odwrocony = new StringBuilder(czystyTekst).reverse().toString();
        return czystyTekst.equals(odwrocony);
    }
}
