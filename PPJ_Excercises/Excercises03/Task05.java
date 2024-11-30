public class Task05 {
    public static void main(String[] args) {
        /*
         Program skompiluje się poprawnie, ponieważ Java rozróżnia wielkość liter
         w nazwach zmiennych. Dlatego `charValue` i `charvalue` są traktowane jako
         dwie różne zmienne. Oczekuję, że obie zmienne zostaną poprawnie zainicjowane
         i ich wartości zostaną wyświetlone na konsoli.
         */

        // Deklaracja i inicjalizacja zmiennych typu char
        char charValue = 'A';
        char charvalue = 'B';

        // Wyświetlenie wartości zmiennych na konsoli
        System.out.println("Wartość zmiennej charValue: " + charValue);
        System.out.println("Wartość zmiennej charvalue: " + charvalue);
    }
}
