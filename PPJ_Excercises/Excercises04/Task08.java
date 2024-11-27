public class Task08 {
    public static void main(String[] args) {
        // Przykładowa wartość zmiennej wrt
        int wrt = -10;

        // Warunki dla zbioru A
        boolean inA = (wrt > -15 && wrt <= -10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10);

        // Warunki dla zbioru B
        boolean inB = (wrt < -13) || (wrt > -8 && wrt <= -3);

        // Warunki dla zbioru C
        boolean inC = (wrt >= -4);

        // Sprawdzenie, czy wrt należy do części wspólnej
        boolean inIntersection = inA && inB && inC;

        // Wynik
        if (inIntersection) {
            System.out.println("Zmienna wrt należy do części wspólnej zbiorów A, B i C.");
        } else {
            System.out.println("Zmienna wrt NIE należy do części wspólnej zbiorów A, B i C.");
        }
    }
}
