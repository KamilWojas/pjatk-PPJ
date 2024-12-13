public class Task06 {
    public static void main(String[] args) {
        System.out.println("Liczby podzielne bez reszty przez 3 i 2 z przedziału od -1500 do 1500:");

        for (int i = -1500; i <= 1500; i++) {
            if (i % 3 == 0 && i % 2 == 0) { // Sprawdzenie podzielności przez 3 i 2
                System.out.println(i);
            }
        }
    }
}
