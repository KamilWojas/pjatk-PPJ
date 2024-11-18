import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Tworzenie trzech tablic o losowych rozmiarach
        int[] array1 = new int[random.nextInt(5) + 5]; // Rozmiar 5-9
        int[] array2 = new int[random.nextInt(5) + 5]; // Rozmiar 5-9
        int[] array3 = new int[random.nextInt(5) + 5]; // Rozmiar 5-9

        // Wypełnianie tablic losowymi wartościami
        fillArrayWithRandomValues(array1, random);
        fillArrayWithRandomValues(array2, random);
        fillArrayWithRandomValues(array3, random);

        // Tworzenie tablicy dwuwymiarowej
        int[][] multiArray = {array1, array2, array3};

        // Wyświetlenie wszystkich wartości w tablicy dwuwymiarowej
        System.out.println("Zawartość tablicy dwuwymiarowej:");
        for (int i = 0; i < multiArray.length; i++) {
            System.out.print("Tablica " + (i + 1) + ": ");
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Funkcja pomocnicza do wypełniania tablic losowymi wartościami
    public static void fillArrayWithRandomValues(int[] array, Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Losowe liczby od 0 do 99
        }
    }
}
