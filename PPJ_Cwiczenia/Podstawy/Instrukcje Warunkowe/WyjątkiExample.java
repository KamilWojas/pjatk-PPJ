public class WyjątkiExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // Próba dzielenia przez zero
            int wynik = a / b;
            System.out.println("Wynik: " + wynik);

        } catch (ArithmeticException e) {
            // Obsługa błędu dzielenia przez zero
            System.out.println("Błąd: Nie można dzielić przez zero!");

        } finally {
            // Kod w bloku finally wykona się zawsze
            System.out.println("Koniec programu.");
        }
    }
}

/*
Wyjaśnienie:
try– W tym bloku umieszczamy kod, który może być wyjątek.
catch– Przechwytuje wyjątek (np. ArithmeticException) i pozwala go obsłużyć.
finally– Kod w tym bloku zawsze się pojawi, czy pojawi się wyjątek.

Wynik:
Błąd: Nie można dzielić przez zero!
Koniec programu.

 */