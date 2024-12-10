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

/*
Dla int: Wywoływana jest metoda setValue(int), ponieważ przekazany literał 10 jest typu int domyślnie.
Dla float: Wywoływana jest metoda setValue(float), ponieważ literał 10.5f ma przyrostek f, oznaczający typ float.
Dla char: Kompilator automatycznie promuje char do int (unicode znaku), więc metoda setValue(int) zostanie wywołana.
Dla byte: Literał (byte) 5 jest explicite rzutowany na byte, ale byte jest automatycznie promowany do int, więc metoda setValue(int) zostanie wywołana.
 */