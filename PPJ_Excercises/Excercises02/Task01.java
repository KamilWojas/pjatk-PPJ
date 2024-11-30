public class Task01 {
    public static void main(String[] args) {
        // Wartość w systemie dziesiętnym
        int decimalValue = 165;

        // Wartość w systemie binarnym (dwójkowym)
        int binaryValue = 0b10100101; // literał binarny (0b oznacza system binarny)

        // Wartość w systemie ósemkowym
        int octalValue = 0255; // literał ósemkowy (0 na początku oznacza system ósemkowy)

        // Wartość w systemie szesnastkowym
        int hexadecimalValue = 0xA5; // literał szesnastkowy (0x oznacza system szesnastkowy)

        // Wyświetlenie wyników
        System.out.println("Wartość w systemie dziesiętnym: " + decimalValue);
        System.out.println("Wartość w systemie binarnym: 0b" + Integer.toBinaryString(decimalValue));
        System.out.println("Wartość w systemie ósemkowym: 0" + Integer.toOctalString(decimalValue));
        System.out.println("Wartość w systemie szesnastkowym: 0x" + Integer.toHexString(decimalValue).toUpperCase());
    }
}
