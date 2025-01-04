public class PrzesunieciaBitoweWyjasnienie {
    public static void main(String[] args) {
        int liczba = 8; // Liczba 8 (binarnie: 00001000)

        // Przesunięcie w lewo o 2 bity
        int przesunLewo = liczba << 2; // 00001000 przesunięte w lewo o 2 bity
        System.out.println("Przesunięcie w lewo (<<):");
        System.out.println("Liczba przed przesunięciem: " + liczba + " (binarnie: " + Integer.toBinaryString(liczba) + ")");
        System.out.println("Liczba po przesunięciu: " + przesunLewo + " (binarnie: " + Integer.toBinaryString(przesunLewo) + ")");

        // Przesunięcie w prawo o 2 bity
        int przesunPrawo = liczba >> 2; // 00001000 przesunięte w prawo o 2 bity
        System.out.println("\nPrzesunięcie w prawo (>>):");
        System.out.println("Liczba przed przesunięciem: " + liczba + " (binarnie: " + Integer.toBinaryString(liczba) + ")");
        System.out.println("Liczba po przesunięciu: " + przesunPrawo + " (binarnie: " + Integer.toBinaryString(przesunPrawo) + ")");
    }
}
