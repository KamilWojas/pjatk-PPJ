import java.util.Scanner;
import java.util.Random;

public class ZgadnijLiczbe {
    public static void main(String[] args) {
        Random random = new Random();
        int wylosowana = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int proba;
        int licznik = 0;

        System.out.println("Zgadnij liczbę z zakresu 1–100!");

        do {
            System.out.print("Twoja próba: ");
            proba = scanner.nextInt();
            licznik++;

            if (proba < wylosowana) {
                System.out.println("Za mało!");
            } else if (proba > wylosowana) {
                System.out.println("Za dużo!");
            } else {
                System.out.println("Gratulacje! Trafiłeś za " + licznik + " razem!");
            }
        } while (proba != wylosowana);

        scanner.close();
    } 
}