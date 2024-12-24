public class DivisibleBySeven {
    public static void main(String[] args) {
        // Pętla przechodząca przez liczby od 1 do 100
        for (int i = 1; i <= 100; i++) {
            // Sprawdzamy, czy liczba jest podzielna przez 7
            if (i % 7 == 0) {
                System.out.println(i); // Wypisujemy liczbę
            }
        }
    }
}
