public class ModifyValueExample {

    // Bezrezultatowa metoda modifyValue
    public static void modifyValue(int wrt) {
        System.out.println("Wartość przed modyfikacją: " + wrt);
        wrt = wrt * 5; // Modyfikacja zmiennej
        System.out.println("Wartość po modyfikacji: " + wrt);
    }

    public static void main(String[] args) {
        int wrt = 5; // Deklaracja zmiennej o wartości 5

        // Wyświetlenie wartości przed wywołaniem metody
        System.out.println("Wartość zmiennej wrt przed wywołaniem metody: " + wrt);

        // Wywołanie metody modifyValue
        modifyValue(wrt);

        // Wyświetlenie wartości po wywołaniu metody
        System.out.println("Wartość zmiennej wrt po wywołaniu metody: " + wrt);
    }
}
