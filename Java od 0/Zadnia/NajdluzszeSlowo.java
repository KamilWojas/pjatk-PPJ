import java.util.Scanner;

public class NajdluzszeSlowo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");
        String zdanie = scanner.nextLine();

        String[] slowa = zdanie.split(" ");

        String najdluzsze = "";

        for (String slowo : slowa) {
            if (slowo.length() > najdluzsze.length()) {
                najdluzsze = slowo; 
            }
        }