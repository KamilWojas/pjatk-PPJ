public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3};

        try {
            // Próba dostępu do elementu poza zakresem tablicy
            System.out.println("Element: " + liczby[5]);
        } catch (ArrayIndexOutOfBoundsException e) {

            // Obsługa wyjątku
            System.out.println("Błąd: Nieprawidłowy indeks tablicy!");
        }
    }
}
