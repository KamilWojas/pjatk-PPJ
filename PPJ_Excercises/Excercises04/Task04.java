public class Task04 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Oryginalne wyrażenie
        boolean resultOriginal = (!(a < b) && !(a > b));

        // Uproszczone wyrażenie
        boolean resultSimplified = (a == b);

        // Sprawdzenie wyników
        System.out.println("Oryginalne wyrażenie: " + resultOriginal);
        System.out.println("Uproszczone wyrażenie: " + resultSimplified);
    }
}
