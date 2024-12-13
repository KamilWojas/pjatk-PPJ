import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[][] array = new int[10][10]; // Tworzenie tablicy 10x10
        Random random = new Random();

        // Wypełnianie tablicy losowymi liczbami
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100); // Losowe liczby od 0 do 99
            }
        }

        // Wyświetlenie tablicy przed sortowaniem
        System.out.println("Tablica przed sortowaniem:");
        printArray(array);

        // Sortowanie każdego wiersza tablicy
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        // Wyświetlenie tablicy po sortowaniu
        System.out.println("\nTablica po sortowaniu:");
        printArray(array);
    }

    // Funkcja do wyświetlania tablicy 2D
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
