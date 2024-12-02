// Klasa Number
class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

// Klasa MethodCurrier
public class MethodCurrier {
    private int field;

    // Metoda setValue dla int
    public void setValue(int value) {
        System.out.println("Stan zmiennej dostarczonej jako parametr: " + value);
        field = value * 2; // Modyfikacja wartości
        System.out.println("Stan zmodyfikowanej zmiennej: " + field);
    }

    // Metoda setValue dla float
    public void setValue(float value) {
        System.out.println("Stan zmiennej dostarczonej jako parametr: " + value);
        field = (int) (value * 10); // Modyfikacja wartości
        System.out.println("Stan zmodyfikowanej zmiennej: " + field);
    }

    // Metoda setValue dla Number
    public void setValue(Number number) {
        System.out.println("Stan zmiennej dostarczonej jako parametr (Number): " + number.getValue());
        number.setValue(number.getValue() + 5); // Modyfikacja wartości
        System.out.println("Stan zmodyfikowanej zmiennej (Number): " + number.getValue());
    }

    // Metoda showValue wyświetlająca wartość pola
    public void showValue() {
        System.out.println("Wartość pola field: " + field);
    }

    public static void main(String[] args) {
        MethodCurrier methodCurrier = new MethodCurrier();

        // Wywołanie setValue dla int
        methodCurrier.setValue(10);
        methodCurrier.showValue();

        // Wywołanie setValue dla float
        methodCurrier.setValue(10.5f);
        methodCurrier.showValue();

        // Wywołanie setValue dla Number
        Number number = new Number(20);
        methodCurrier.setValue(number);
        System.out.println("Ostateczna wartość obiektu Number: " + number.getValue());
    }
}
