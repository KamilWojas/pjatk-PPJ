public class SumOf2DArrayExtended {
    public static void main(String[] args) {
        // Tworzymy rozszerzoną tablicę dwuwymiarową
        int[][] tablica = {
                {1, 2, 3, 4},  // Pierwszy wiersz (4 kolumny)
                {5, 6, 7, 8},  // Drugi wiersz (4 kolumny)
                {9, 10, 11, 12} // Trzeci wiersz (4 kolumny)
        };

        int suma = 0; // Zmienna przechowująca sumę elementów

        // Zagnieżdżona pętla do przejścia przez wszystkie elementy tablicy
        for (int i = 0; i < tablica.length; i++) { // Pętla dla wierszy
            for (int j = 0; j < tablica[i].length; j++) { // Pętla dla kolumn
                suma += tablica[i][j]; // Dodajemy element do sumy
            }
        }

        // Wyświetlamy sumę wszystkich elementów
        System.out.println("Suma wszystkich elementów: " + suma);
    }
}

/*

 */
