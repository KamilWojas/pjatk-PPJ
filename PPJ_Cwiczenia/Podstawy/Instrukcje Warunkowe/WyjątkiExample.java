public class WyjątkiExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // Próba dzielenia przez zero
            int wynik = a / b;
            System.out.println("Wynik: " + wynik);