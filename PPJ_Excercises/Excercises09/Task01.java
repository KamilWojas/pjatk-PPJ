public class MethodCurrier {

    // Metoda przyjmująca parametr typu int
    public void setValue(int value) {
        System.out.println("Parametr typu int: " + value);
    }

    // Metoda przyjmująca parametr typu float
    public void setValue(float value) {
        System.out.println("Parametr typu float: " + value);
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy MethodCurrier
        MethodCurrier methodCurrier = new MethodCurrier();

        // Wywołanie metod z różnymi typami danych
        methodCurrier.setValue(10);           // int
        methodCurrier.setValue(10.5f);       // float
        methodCurrier.setValue('A');         // char
        methodCurrier.setValue((byte) 5);    // byte
    }
}
