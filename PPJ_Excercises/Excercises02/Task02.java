public class Task02 {
    public static void main(String[] args) {
        // Wartość początkowa
        int value = 14;
        System.out.println("Wartość początkowa: " + value);

        // Przesunięcie o 0 pozycji w prawo
        int shiftRight0 = value >> 0;
        System.out.println("Po przesunięciu o 0 pozycji w prawo: " + shiftRight0);

        // Przesunięcie rezultatu o 2 pozycje w lewo
        int shiftLeft2 = shiftRight0 << 2;
        System.out.println("Po przesunięciu o 2 pozycje w lewo: " + shiftLeft2);

        // Przesunięcie rezultatu o 4 pozycje w prawo
        int shiftRight4 = shiftLeft2 >> 4;
        System.out.println("Po przesunięciu o 4 pozycje w prawo: " + shiftRight4);
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