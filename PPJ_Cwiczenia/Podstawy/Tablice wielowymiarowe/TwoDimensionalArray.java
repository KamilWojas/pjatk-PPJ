public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] tablica = {
                {1, 2, 3}, // Pierwszy wiersz
                {4, 5, 6}  // Drugi wiersz
        };

        // Wypisanie wszystkich elementów tablicy
        for (int i = 0; i < tablica.length; i++) { // Iteracja po wierszach
            for (int j = 0; j < tablica[i].length; j++) { // Iteracja po kolumnach
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println(); // Nowa linia po każdym wierszu
        }
    }
}

/*
Wyjaśnienie:
int[][] tablica– Deklarujemy tablicę dwuwymiarową.
tablica.length– Długość długości (liczba wierszy).
tablica[i].length– Długość dostarczana wiersza (liczba kolumnowa).
Pętla zagnieżdżona ( for) – Zewnętrzna sieć przechodząca przez wiersze, a wewnętrzna przez prowadnice.
 */