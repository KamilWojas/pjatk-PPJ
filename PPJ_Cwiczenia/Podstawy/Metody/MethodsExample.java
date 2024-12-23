/*
Metody to fragmenty kodu, które wykonują określone zadanie
i mogą być wielokrotnie wywoływane.
 */

public class MethodsExample {
    public static void main(String[] args) {
        int liczba = 4;
        int wynik = kwadrat(liczba); // Wywołanie metody
        System.out.println("Kwadrat liczby " + liczba + " wynosi " + wynik);
    }

    // Metoda obliczająca kwadrat liczby
    public static int kwadrat(int x) {
        return x * x; // Zwraca kwadrat liczby
    }
}