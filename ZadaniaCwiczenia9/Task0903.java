package ZadaniaCwiczenia9;

/*Dana jest n-elementowa tablica (posortowana niemalejąco) liczb calkowitych, gdzie n >= 2.
        Napisz program zliczający ile jest różnych wartości w podanej tablicy.
        Przykład: w tablicy {1, 1, 2, 3, 3} występują trzy różne wartości 1, 2, 3.*/


import java.util.HashSet;
import java.util.Set;

public class Task0903 {
    public static void main(String[] args) {

        int[] array = {1, 4, 4, 5, 6, 7, 7, 8};

        System.out.println("Liczba różnych wartości w tablicy: " + wartosci(array));
    }
    private static int wartosci(int[] array) {

        Set<Integer> uniqueValues = new HashSet<>();
        for (int value : array) {
            uniqueValues.add(value);
        }
        return uniqueValues.size();
    }
}