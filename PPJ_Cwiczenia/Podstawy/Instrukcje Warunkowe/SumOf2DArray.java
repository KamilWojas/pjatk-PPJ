public class SumOf2DArray {
    public static void main(String[] args) {
        // Tworzymy tablicę dwuwymiarową
        int[][] tablica = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int suma = 0; // Zmienna przechowująca sumę elementów

        // Zagnieżdżona pętla do przejścia przez wszystkie elementy tablicy
        for (int i = 0; i < tablica.length; i++) { // Pętla dla wierszy
            for (int j = 0; j < tablica[i].length; j++) { // Pętla dla kolumn
                suma += tablica[i][j]; // Dodajemy element do sumy
            }
        }
