public class Task21 {
    public static void main(String[] args) {
        int wPrawo = 0b1110 >> 0;
        System.out.println("Przesunięcie o 0 w prawo: " + wPrawo); // Wynik: 14

        int wLewo = 0b1110 << 2;
        System.out.println("Przesunięcie o 2 w lewo: " + wLewo); // Wynik: 56

        int wPrawoO4 = wLewo >> 4;

    }