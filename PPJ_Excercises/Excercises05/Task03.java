public class Main {
    public static void main(String[] args) {
        int x = 5;

        // Przykład z pętlą while
        System.out.println("Pętla while:");
        while (x < 5) { // Warunek jest sprawdzany na początku
            System.out.println("Wartość x: " + x);
            x++;
        }

        // Przykład z pętlą do-while
        System.out.println("\nPętla do-while:");
        do {
            System.out.println("Wartość x: " + x); // Instrukcja wykonuje się przynajmniej raz
            x++;
        } while (x < 5); // Warunek jest sprawdzany na końcu
    }
}
