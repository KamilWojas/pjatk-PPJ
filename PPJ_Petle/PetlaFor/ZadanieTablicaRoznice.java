/*
Napisz program, który obliczy różnicę każdego elementu tablicy z sumą wszystkich
pozostałych elementów w tablicy. Wynik dla każdego elementu wyświetl na konsoli.
Wykorzystaj jedną pętlę for.
 */

public class ZadanieTablicaRoznice {
    public static void main(String[] args) {
        int[] tab = {3, 5, 7, 9}; // Tablica liczb całkowitych

        // Obliczanie sumy wszystkich elementów tablicy
        int suma = 0;
        for (int num : tab) { // Pętla foreach
            suma += num;
        }