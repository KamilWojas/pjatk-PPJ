import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int size = 8; // Wymiary tablicy 8x8
        int[][] array = new int[size][size];
        Random random = new Random();

        // Wypełnianie tablicy losowymi liczbami z przedziału 0-10
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(11); // Losowe liczby od 0 do 10
            }
        }

        // Wyświetlanie tablicy
        System.out.println("Tablica 8x8:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Sprawdzanie liczb na przekątnych
        int[] count = new int[11]; // Tablica do zliczania wystąpień liczb (0-10)

        for (int i = 0; i < size; i++) {
            // Główna przekątna
            count[array[i][i]]++;
            // Przekątna przeciwna
            count[array[i][size - 1 - i]]++;
        }

        // Sprawdzanie, czy jakaś liczba występuje przynajmniej 3 razy
        boolean found = false;
        System.out.println("\nWystąpienia liczb na przekątnych:");
        for (int i = 0; i < count.length; i++) {
            System.out.println("Liczba " + i + ": " + count[i] + " razy");
            if (count[i] >= 3) {
                found = true;
            }
        }

        // Wynik
        if (found) {
            System.out.println("\nNa przekątnych występuje przynajmniej jedna liczba co najmniej 3 razy.");
        } else {
            System.out.println("\nNa przekątnych nie występuje żadna liczba co najmniej 3 razy.");
        }
    }
}
