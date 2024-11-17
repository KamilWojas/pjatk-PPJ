public class Task02 {
    public static void main(String[] args) {
        int i = 10; // i = 10

        // Postinkrementacja (i++): Najpierw wartość i jest używana, a potem zwiększana.
        i = i++;
        // Wyjaśnienie:
        // 1. Pierwotna wartość i (10) jest zapamiętana do przypisania.
        // 2. i jest zwiększane do 11, ale zapamiętana wartość (10) zostaje przypisana.
        // Ostatecznie: i = 10

        i = ++i;
        // Wyjaśnienie:
        // 1. Preinkrementacja (++i): Najpierw i jest zwiększane do 11.
        // 2. Zwiększona wartość (11) zostaje przypisana do i.
        // Ostatecznie: i = 11

        i = i++ + ++i;
        // Wyjaśnienie:
        // 1. Najpierw wartość i (11) jest zapamiętana do operacji (i++).
        // 2. Następnie preinkrementacja (++i): i jest zwiększane do 12, a potem do 13.
        // 3. Operacja dodawania: 11 (wartość z i++) + 13 (wartość z ++i).
        // 4. Wynik dodawania (24) zostaje przypisany do i.
        // Ostatecznie: i = 24

        // Wyświetlenie końcowej wartości i:
        System.out.println("Wartość i: " + i);
    }
}
