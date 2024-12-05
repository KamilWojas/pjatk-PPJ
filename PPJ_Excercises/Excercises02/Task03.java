public class Task03 {
    public static void main(String[] args) {
        // Definicja literału (liczba całkowita)
        int number = 0b1010110010111100_1101110101011101; // Przykład liczby binarnej
        System.out.println("Literał w dziesiętnym: " + number);

        // 1. Wartość reprezentowana przez ostatnie 5 bitów
        int last5Bits = number & 0b11111; // Maska do wyciągnięcia ostatnich 5 bitów
        System.out.println("Ostatnie 5 bitów: " + last5Bits);

        // 2. 1 lub 0 zależnie od wartości siódmego bitu
        int seventhBit = (number >> 6) & 1; // Przesunięcie o 6 bitów w prawo i maskowanie
        System.out.println("Siódmy bit: " + seventhBit);

        // 3. Wartość poszczególnych bajtów (0-255)
        int byte1 = (number >> 24) & 0xFF; // Najbardziej znaczący bajt
        int byte2 = (number >> 16) & 0xFF; // Drugi bajt
        int byte3 = (number >> 8) & 0xFF;  // Trzeci bajt
        int byte4 = number & 0xFF;         // Najmniej znaczący bajt

        System.out.println("Najbardziej znaczący bajt: " + byte1);
        System.out.println("Drugi bajt: " + byte2);
        System.out.println("Trzeci bajt: " + byte3);
        System.out.println("Najmniej znaczący bajt: " + byte4);

        // 4. Wartość reprezentowana przez dwa środkowe bajty
        int middleTwoBytes = (number >> 8) & 0xFFFF; // Wyciągnięcie dwóch środkowych bajtów
        System.out.println("Dwa środkowe bajty: " + middleTwoBytes);
    }
}

/*
Literał:

Zdefiniowano w systemie binarnym jako 32-bitowy.
Ostatnie 5 bitów:

Używamy maski 0b11111, która ma ustawione ostatnie 5 bitów.
Siódmy bit:

Przesuwamy liczbę o 6 bitów w prawo, a następnie maskujemy 1 bitem.
Wartości bajtów:

Każdy bajt to 8 bitów. Przesunięcie i maska 0xFF pozwala wyciągnąć odpowiednie bajty.
Dwa środkowe bajty:

Przesuwamy liczbę o 8 bitów w prawo, a następnie maskujemy 16 bitami (0xFFFF).
 */