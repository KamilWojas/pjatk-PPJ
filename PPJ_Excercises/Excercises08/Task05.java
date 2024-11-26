public class Task05 {
    public static void main(String[] args) {
        // Wywołanie metody z przykładowymi argumentami
        drawSquare(5, 'x');
    }

    /**
     * Metoda rysująca kwadrat z naprzemiennych znaków.
     *
     * @param size   liczba znaków w boku kwadratu
     * @param start  znak, od którego należy rozpocząć ('x' lub 'o')
     */
    public static void drawSquare(int size, char start) {
        char firstChar = start;
        char secondChar = (start == 'x') ? 'o' : 'x';

        for (int i = 0; i < size; i++) { // iteracja po wierszach
            for (int j = 0; j < size; j++) { // iteracja po kolumnach
                if ((i + j) % 2 == 0) {
                    System.out.print(firstChar); // naprzemiennie pierwszy znak
                } else {
                    System.out.print(secondChar); // naprzemiennie drugi znak
                }
            }
            System.out.println(); // przejście do nowego wiersza
        }
    }
}
