/*
Napisz program, który wypisze wszystkie liczby parzyste w tablicy.
 */

public class EvenNumbersInArray {
    public static void main(String[] args) {
        int[] liczby = {10, 15, 20, 25, 30}; // Tablica z liczbami

        // Pętla przechodząca przez tablicę
        for (int i = 0; i < liczby.length; i++) {
            // Sprawdzamy, czy liczba jest parzysta
            if (liczby[i] % 2 == 0) {
                System.out.println(liczby[i]); // Wypisujemy liczbę
            }
        }
    }
}
