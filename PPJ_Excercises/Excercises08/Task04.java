import java.util.Random;

public class ArrayOperation {
    public static void main(String[] args) {
        // Tworzymy i wypełniamy dwie tablice losowymi wartościami
        int[] array1 = generateRandomArray(10);
        int[] array2 = generateRandomArray(10);

        // Wartość dodatkowego argumentu
        int condition = -5;

        // Wywołanie metody
        int[] result = processArrays(array1, array2, condition);

        // Wyświetlenie wyników
        System.out.println("Tablica 1:");
        printArray(array1);
        System.out.println("Tablica 2:");
        printArray(array2);
        System.out.println("Wynik:");
        if (result != null) {
            printArray(result);
        } else {
            System.out.println("Wynik: null");
        }
    }

    // Generuje tablicę losowych liczb całkowitych
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Losowe liczby od 0 do 99
        }
        return array;
    }

    // Metoda przetwarzająca dwie tablice i wartość argumentu int
    public static int[] processArrays(int[] array1, int[] array2, int condition) {
        if (condition < 0) {
            // Dostarczenie tablicy, której wartościami będą sumy elementów na tych samych indeksach
            int minLength = Math.min(array1.length, array2.length);
            int[] sumArray = new int[minLength];
            for (int i = 0; i < minLength; i++) {
                sumArray[i] = array1[i] + array2[i];
            }
            return sumArray;
        } else if (condition > 0) {
            // Dostarczenie tablicy zawierającej tylko te elementy, które nie mają "pary" indeksowej
            int minLength = Math.min(array1.length, array2.length);
            int[] unpairedArray = new int[array1.length + array2.length - 2 * minLength];
            int index = 0;

            // Dodaj elementy bez pary z array1
            for (int i = minLength; i < array1.length; i++) {
                unpairedArray[index++] = array1[i];
            }

            // Dodaj elementy bez pary z array2
            for (int i = minLength; i < array2.length; i++) {
                unpairedArray[index++] = array2[i];
            }

            return unpairedArray;
        } else {
            // Dostarczenie literału null
            return null;
        }
    }

    // Funkcja pomocnicza do wyświetlania zawartości tablicy
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
