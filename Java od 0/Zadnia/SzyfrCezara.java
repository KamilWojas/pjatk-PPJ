import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        System.out.print("Podaj klucz przesunięcia: ");
        int klucz = scanner.nextInt();

        String zaszyfrowanyTekst = zaszyfrujCezarem(tekst, klucz);

        System.out.println("Zaszyfrowany tekst: " + zaszyfrowanyTekst);

        scanner.close();
    }

    public static String zaszyfrujCezarem(String tekst, int klucz) {
        StringBuilder wynik = new StringBuilder();

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) {
                char baza = Character.isUpperCase(znak) ? 'A' : 'a';
                char zaszyfrowany = (char) ((znak - baza + klucz) % 26 + baza);
                wynik.append(zaszyfrowany);
            } else {
                wynik.append(znak);
            }
        }

        return wynik.toString();
    }
}


