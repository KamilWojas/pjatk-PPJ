public class Task06 {
    public static void main(String[] args) {
        // Deklaracja i inicjalizacja zmiennych
        int a = 10;       // Zmienna całkowita
        double b = 20.5;  // Zmienna zmiennoprzecinkowa

        /*
         1. Przypisanie `a = b` spowoduje błąd kompilacji, ponieważ `b` jest typu double,
            a `a` jest typu int. W Java nie można bezpośrednio przypisać typu zmiennoprzecinkowego do int.
         2. Przypisanie `b = a` jest poprawne, ponieważ wartości typu int mogą być przypisane
            do zmiennej typu double bez rzutowania, gdyż double może przechowywać liczby całkowite.
         */

        // Próba przypisania b do a
        // a = b; // Błąd kompilacji: niezgodność typów (Type mismatch: cannot convert from double to int)

        // Poprawne przypisanie a do b
        b = a;

        // Wyświetlenie wyników
        System.out.println("Wartość a: " + a);
        System.out.println("Wartość b: " + b);

        /*
         - Aby przypisać wartość zmiennej typu double do zmiennej typu int, konieczne jest jawne rzutowanie:
           a = (int) b;
         - Przypisanie wartości int do zmiennej double nie wymaga rzutowania, ponieważ jest to konwersja rozszerzająca.
         */
    }
}
