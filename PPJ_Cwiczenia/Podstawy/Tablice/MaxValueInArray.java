/*
Program, który przechodzi przez tablicę i znajduje największą liczbę.
 */


public class MaxValueInArray {
    public static void main(String[] args) {
        int[] liczby = {10, 25, 3, 7, 18}; // Tablica z liczbami
        int max = liczby[0]; // Zakładamy, że pierwszy element jest największy

        for (int i = 1; i < liczby.length; i++) { // Zaczynamy od drugiego elementu
            if (liczby[i] > max) {
                max = liczby[i]; // Aktualizujemy maksymalną wartość
            }
        }

        System.out.println("Największa liczba: " + max);
    }
}
