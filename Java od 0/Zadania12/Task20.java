public class Task20 {
    public static void main(String[] args) {
        int liczba = 250;
        int ostatnie5Bitow = liczba & 0b11111;

        System.out.println("Liczba: " + liczba + " (binarnie: " + Integer.toBinaryString(liczba) + ")");
        System.out.println("Ostatnie 5 bitów: " + ostatnie5Bitow + " (binarnie: " + Integer.toBinaryString(ostatnie5Bitow) + ")");
    }
}