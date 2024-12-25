public class ArrayExample {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3, 4, 5}; // Deklaracja i inicjalizacja tablicy


        // Wypisywanie wszystkich elementów tablicy
        for (int i = 0; i < liczby.length; i++) { // Pętla przechodzi przez wszystkie indeksy
            System.out.println("Element " + i + ": " + liczby[i]);
        }
    }
}

/*
Wyjaśnienie:
int[] liczby = {1, 2, 3, 4, 5}; - Tablica przechowuje liczby całkowite.
liczby.length - Zwraca długość tablicy (w tym przypadku 5).
liczby[i] - Dostęp do elementu o indeksie i (indeksy zaczynają się od 0).
 */