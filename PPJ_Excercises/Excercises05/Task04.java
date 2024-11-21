public class Main {
    public static void main(String[] args) {
        int n = 10; // Liczba elementów do wyświetlenia
        double term; // Pojedynczy element szeregu
        double sum = 0; // Suma elementów szeregu

        System.out.println("Pierwsze " + n + " elementów szeregu geometrycznego:");
        for (int i = 0; i < n; i++) {
            term = 1 / Math.pow(2, i); // Obliczenie i-tego elementu
            sum += term; // Dodanie elementu do sumy
            System.out.println("Element " + (i + 1) + ": " + term);
        }

        System.out.println("\nSuma pierwszych " + n + " elementów: " + sum);
    }
}
