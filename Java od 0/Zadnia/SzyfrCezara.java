import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        System.out.print("Podaj klucz przesunięcia: ");
        int klucz = scanner.nextInt();

        String zaszyfrowanyTekst = zaszyfrujCezarem(tekst, klucz);
