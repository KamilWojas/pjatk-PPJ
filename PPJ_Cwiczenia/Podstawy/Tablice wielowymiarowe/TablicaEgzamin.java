public class TablicaEgzamin {
    public static void main(String[] args) {
        int[] tablica = new int[10]; // Tworzę tablicę o rozmiarze 10

        // Wypełniam tablicę liczbami od 1 do 10
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1; // Wartości od 1 do 10
        }
// Wypisuje liczby parzyste
        System.out.println("Liczby parzyste w tablicy:");
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0) { // Sprawdzamy, czy liczba jest parzysta
                System.out.println(tablica[i]);
            }
        }
    }
}