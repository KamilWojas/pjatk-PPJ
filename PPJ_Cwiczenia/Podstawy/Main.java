public class Main {
    public static void main(String[] args) {
        // 1. Deklaracja i inicjalizacja zmiennych
        int liczbaCalkowita = 10;
        double liczbaZPrzecinkiem = 3.14;
        boolean czyPrawda = true;
        char znak = 'A';
        String tekst = "Witaj w nauce Javy!";

        // 2. Wyświetlanie wartości zmiennych
        System.out.println("Liczba całkowita: " + liczbaCalkowita);
        System.out.println("Liczba z przecinkiem: " + liczbaZPrzecinkiem);
        System.out.println("Wartość logiczna: " + czyPrawda);
        System.out.println("Znak: " + znak);
        System.out.println("Tekst: " + tekst);

        // 3. Operacje matematyczne
        int a = 20;
        int b = 5;
        System.out.println("Dodawanie: " + (a + b)); // 25
        System.out.println("Odejmowanie: " + (a - b)); // 15
        System.out.println("Mnożenie: " + (a * b)); // 100
        System.out.println("Dzielenie: " + (a / b)); // 4
        System.out.println("Reszta z dzielenia (modulo): " + (a % b)); // 0
    }
}