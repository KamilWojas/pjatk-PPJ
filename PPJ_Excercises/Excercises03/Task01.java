public class Task01 {
    public static void main(String[] args) {
        // Typ logiczny
        boolean boolTrue = true;  // Literał logiczny
        boolean boolFalse = false;

        // Typ całkowity - byte (8-bitowy, od -128 do 127)
        byte byteMin = -128;       // Dziesiętny
        byte byteMax = 127;

        // Typ całkowity - short (16-bitowy, od -32,768 do 32,767)
        short shortMin = -32768;   // Dziesiętny
        short shortMax = 32767;

        // Typ całkowity - int (32-bitowy, od -2^31 do 2^31-1)
        int intMin = -2147483648;          // Dziesiętny
        int intMax = 2147483647;
        int intHex = 0x7FFFFFFF;           // Szesnastkowy
        int intBin = 0b01111111111111111111111111111111; // Binarny

        // Typ całkowity - long (64-bitowy, od -2^63 do 2^63-1)
        long longMin = -9223372036854775808L;  // Dziesiętny
        long longMax = 9223372036854775807L;
        long longHex = 0x7FFFFFFFFFFFFFFFL;    // Szesnastkowy
        long longBin = 0b0111111111111111111111111111111111111111111111111111111111111111L; // Binarny

        // Typ zmiennoprzecinkowy - float (32-bitowy)
        float floatMin = -3.4028235e38f;  // Dziesiętny
        float floatMax = 3.4028235e38f;

        // Typ zmiennoprzecinkowy - double (64-bitowy)
        double doubleMin = -1.7976931348623157e308;  // Dziesiętny
        double doubleMax = 1.7976931348623157e308;

        // Typ znakowy - char (16-bitowy, od '\u0000' do '\uFFFF')
        char charMin = '\u0000';         // Najmniejszy znak (UNICODE)
        char charMax = '\uFFFF';         // Największy znak (UNICODE)
        char charDecimal = 65;           // Literał dziesiętny (A)
        char charHex = 0x41;             // Literał szesnastkowy (A)

        // Wyświetlenie wartości
        System.out.println("Boolean: " + boolTrue + ", " + boolFalse);
        System.out.println("Byte: " + byteMin + ", " + byteMax);
        System.out.println("Short: " + shortMin + ", " + shortMax);
        System.out.println("Int: " + intMin + ", " + intMax + ", Hex: " + intHex + ", Bin: " + intBin);
        System.out.println("Long: " + longMin + ", " + longMax + ", Hex: " + longHex + ", Bin: " + longBin);
        System.out.println("Float: " + floatMin + ", " + floatMax);
        System.out.println("Double: " + doubleMin + ", " + doubleMax);
        System.out.println("Char: Min: " + charMin + ", Max: " + charMax + ", Decimal: " + charDecimal + ", Hex: " + charHex);
    }
}
