public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] tablica = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int suma = 0;

        // Zagnieżdżona pętla do przejścia przez elementy tablicy
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                suma += tablica[i][j]; // Dodajemy elementy do sumy
            }
        }

        System.out.println("Suma wszystkich elementów: " + suma);
    }
}