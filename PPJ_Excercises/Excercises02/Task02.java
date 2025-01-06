public class Task02 {
    public static void main(String[] args) {
        // Wartość początkowa
        int value = 14;
        System.out.println("Wartość początkowa: " + value);

        int wPrawo = value >> 0;
        System.out.println("Przesunięcie o 0 w prawo: " + wPrawo);
        int wLewo = wPrawo << 2;
        System.out.println("Przesunięcie o 2 w lewo: " + wLewo);

        int wLewoo = wLewo << 2;
        System.out.println("Przesinięcie o 2 w lewo: " + wLewoo);

    }
}

/*
Pierwszy krok:

>> 0: Przesunięcie bitowe w prawo o 0 pozycji nie zmienia wartości liczby.
Drugi krok:

<< 2: Przesunięcie bitowe w lewo o 2 pozycje powoduje pomnożenie liczby przez 2^2 (czyli 4).
Trzeci krok:

>> 4: Przesunięcie bitowe w prawo o 4 pozycje dzieli liczbę przez 2^4 (czyli 16), ignorując część ułamkową.
 */



/*
Wartość początkowa: 14
Po przesunięciu o 0 pozycji w prawo: 14
Po przesunięciu o 2 pozycje w lewo: 56
Po przesunięciu o 4 pozycje w prawo: 3

 */