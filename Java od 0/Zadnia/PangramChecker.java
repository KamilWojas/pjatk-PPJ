import java.util.Scanner;
import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        if (czyPangram(tekst)) {
            System.out.println("Tekst jest pangramem.");
        } else {
            System.out.println("Tekst nie jest pangramem.");
        }

        scanner.close();
    }

    public static boolean czyPangram(String tekst) {
        tekst = tekst.toLowerCase(); 
        HashSet<Character> litery = new HashSet<>();

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) { 
                litery.add(znak);
            }
        }