public class Task23 {
    public static void main(String[] args) {
        int wartosc = 217; // 11011001 binarnie

        // Wyciągamy ostatnie 5 bitów za pomocą maski 0b11111
        int ostatnie5Bitow = wartosc & 0b11111; // AND z maską 0b11111

        // Wyświetlamy wyniki
        System.out.println("Wartość: " + wartosc + " (binarnie: " + Integer.toBinaryString(wartosc) + ")");
        System.out.println("Ostatnie 5 bitów: " + ostatnie5Bitow + " (binarnie: " + Integer.toBinaryString(ostatnie5Bitow) + ")");
    }
}