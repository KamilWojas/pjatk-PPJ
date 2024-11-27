public class Task05 {
    public static void main(String[] args) {
        // Definicja trzech zmiennych typu int
        int a = 10;
        int b = 10;
        int c = 10;

        // Sprawdzenie, czy zmienne są takie same, za pomocą operatora trójargumentowego
        String result = (a == b && b == c) ? "Są takie same" : "Nie są takie same";

        // Wyświetlenie wyniku
        System.out.println(result);
    }
}
