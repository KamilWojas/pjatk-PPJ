public class ShowMethodExample {

    // Bezrezultatowa metoda show
    public static void show(int value) {
        System.out.println("Wartość przekazana do metody: " + value);
    }

    public static void main(String[] args) {
        // Przykładowe wywołanie metody
        System.out.println("Wywołanie metody show z wartością 42:");
        show(42);

        System.out.println("Wywołanie metody show z wartością 100:");
        show(100);
    }
}
