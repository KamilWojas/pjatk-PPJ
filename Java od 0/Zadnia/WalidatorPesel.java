import java.util.Scanner;

public class WalidatorPesel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();

        if (!czyPoprawnaDlugosc(pesel)) {
            System.out.println("Błąd: PESEL musi mieć dokładnie 11 cyfr.");
        } else if (!czyTylkoCyfry(pesel)) {
            System.out.println("Błąd: PESEL może zawierać tylko cyfry.");
        } else if (!czyPoprawnaSumaKontrolna(pesel)) {
            System.out.println("Błąd: Niepoprawna suma kontrolna PESEL.");
        } else {
            System.out.println("PESEL poprawny.");
        }

        scanner.close();
    }
