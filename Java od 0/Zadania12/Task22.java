public class Task22 {
    public static void main(String[] args) {
        int liczba = 14; // 14 w systemie dziesiętnym (binarnie: 1110)

        // 1. Przesunięcie o zero pozycji w prawo
        int wynik1 = liczba >> 0; // Przesunięcie o 0 nie zmienia liczby
        System.out.println("1. Przesunięcie o 0 w prawo: " + wynik1 + " (binarnie: " + Integer.toBinaryString(wynik1) + ")");

        // 2. Rezultat poprzedniego punktu przesunięty o 2 pozycje w lewo
        int wynik2 = wynik1 << 2; // Przesunięcie o 2 w lewo

    }