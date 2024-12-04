public class BitShiftExample {
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
Wartość początkowa: 14
Po przesunięciu o 0 pozycji w prawo: 14
Po przesunięciu o 2 pozycje w lewo: 56
Po przesunięciu o 4 pozycje w prawo: 3

 */