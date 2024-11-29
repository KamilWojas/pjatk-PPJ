public class Task02 {
    public static void main(String[] args) {
        // Deklaracja i inicjalizacja zmiennych

        // Typ logiczny
        boolean boolValue1 = true;
        boolean boolValue2 = false;

        // Typy całkowite
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;

        // Typy zmiennoprzecinkowe
        float floatValue = 3.14f;
        double doubleValue = 2.718;

        // Typ znakowy
        char charValue1 = 'A';  // Unicode 65
        char charValue2 = '\u0041'; // Unicode A in hex

        // Porównania i wypisanie wyników na konsolę

        // Porównanie logiczne
        System.out.println("boolValue1 == boolValue2: " + (boolValue1 == boolValue2));

        // Porównania w obrębie typów całkowitych
        System.out.println("byteValue == shortValue: " + (byteValue == shortValue));
        System.out.println("shortValue == intValue: " + (shortValue == intValue));
        System.out.println("intValue == longValue: " + (intValue == longValue));

        // Porównania w obrębie typów zmiennoprzecinkowych
        System.out.println("floatValue == doubleValue: " + (floatValue == doubleValue));

        // Porównania znaków
        System.out.println("charValue1 == charValue2: " + (charValue1 == charValue2)); // 'A' == 'A'

        // Porównania różnych typów
        System.out.println("byteValue == charValue1: " + (byteValue == charValue1)); // 10 == 65 -> false
        System.out.println("intValue == charValue1: " + (intValue == charValue1)); // 30 == 65 -> false

        // Nie można porównywać typów logicznych z innymi typami - operator `==` nie jest kompatybilny
        // System.out.println("boolValue1 == byteValue: " + (boolValue1 == byteValue)); // Błąd kompilacji
        // System.out.println("boolValue1 == floatValue: " + (boolValue1 == floatValue)); // Błąd kompilacji

        // Porównania typów całkowitych i zmiennoprzecinkowych
        System.out.println("intValue == floatValue: " + (intValue == floatValue)); // 30 == 3.14 -> false
        System.out.println("longValue == doubleValue: " + (longValue == doubleValue)); // 40 == 2.718 -> false

        // Porównania znaków z typami zmiennoprzecinkowymi
        System.out.println("charValue1 == floatValue: " + (charValue1 == floatValue)); // 65 == 3.14 -> false
    }
}
