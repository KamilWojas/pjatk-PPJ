public class Task01 {
    public static void main(String[] args) {
        int value = 14; // Wartość początkowa

        // 1. Przesunięcie o 0 pozycji w prawo
        int result1 = value >> 0;
        System.out.println("Przesunięcie o 0 pozycji w prawo: " + result1);

        // 2. Przesunięcie rezultatu o 2 pozycje w lewo
        int result2 = result1 << 2;
        System.out.println("Przesunięcie rezultatu o 2 pozycje w lewo: " + result2);

        // 3. Przesunięcie rezultatu o 4 pozycje w prawo
        int result3 = result2 >> 4;
        System.out.println(

                "Przesunięcie rezultatu o 4 pozycje w prawo: " + result3);
    }
}