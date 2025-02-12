public class Task22 {
    public static void main(String[] args) {
        int liczba = 14; // 14 w systemie dziesiętnym (binarnie: 1110)

        // 1. Przesunięcie o zero pozycji w prawo
        int wynik1 = liczba >> 0; // Przesunięcie o 0 nie zmienia liczby
        System.out.println("1. Przesunięcie o 0 w prawo: " + wynik1 + " (binarnie: " + Integer.toBinaryString(wynik1) + ")");

        // 2. Rezultat poprzedniego punktu przesunięty o 2 pozycje w lewo
        int wynik2 = wynik1 << 2; // Przesunięcie o 2 w lewo
        System.out.println("2. Przesunięcie o 2 w lewo: " + wynik2 + " (binarnie: " + Integer.toBinaryString(wynik2) + ")");

        // 3. Rezultat poprzedniego punktu przesunięty o 4 pozycje w prawo
        int wynik3 = wynik2 >> 4; // Przesunięcie o 4 w prawo
        System.out.println("3. Przesunięcie o 4 w prawo: " + wynik3 + " (binarnie: " + Integer.toBinaryString(wynik3) + ")");
    }
}