public class PorownaniaTypow {
    public static void main(String[] args) {

        //Typ logiczny (boolean)
        boolean logiczna1 = true;
        boolean logiczna2 = false;

        //Liczby całkowite (int, byte, short, long)
        int liczbaCalkowita = 10;
        byte liczbaByte = 10;
        short liczbaShort = 10;
        long liczbaLong = 10L;

        //Liczby rzeczywiste (float, double)
        float liczbaFloat = 10.0f;
        double liczbaDouble = 10.0;

        //Znak (char)
        char znak = 'A';  // Unicode 65
        char znak2 = 65;  // też 'A'

        //Wypiszmy wartości
        System.out.println("char znak: " + znak);
        System.out.println("char znak2 (65): " + znak2);

        //Możliwe porównania:
        System.out.println("liczbaCalkowita == liczbaByte: " + (liczbaCalkowita == liczbaByte)); // true
        System.out.println("liczbaCalkowita == liczbaShort: " + (liczbaCalkowita == liczbaShort)); // true
        System.out.println("liczbaCalkowita == liczbaLong: " + (liczbaCalkowita == liczbaLong)); // true

        System.out.println("liczbaFloat == liczbaDouble: " + (liczbaFloat == liczbaDouble)); // true (w tym przypadku, bo 10.0 == 10.0)

        System.out.println("liczbaCalkowita == liczbaFloat: " + (liczbaCalkowita == liczbaFloat)); // true
        System.out.println("liczbaCalkowita == liczbaDouble: " + (liczbaCalkowita == liczbaDouble)); // true
    }
}