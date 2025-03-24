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

    public static boolean czyPoprawnaDlugosc(String pesel) {
        return pesel.length() == 11;
    }

    public static boolean czyTylkoCyfry(String pesel) {
        return pesel.matches("\\d+");
    }

    public static boolean czyPoprawnaSumaKontrolna(String pesel) {
        int[] wagi = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            int cyfra = Character.getNumericValue(pesel.charAt(i));
            suma += cyfra * wagi[i];
        }

        int ostatniaCyfra = Character.getNumericValue(pesel.charAt(10));
        return (suma % 10) == ostatniaCyfra;
    }
}