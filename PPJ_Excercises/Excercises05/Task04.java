public class Task04 {
    public static void main(String[] args) {
        int n = 10; 
        double term; 
        double sum = 0;

        System.out.println("Pierwsze " + n + " elementów szeregu geometrycznego:");
        for (int i = 0; i < n; i++) {
            term = 1 / Math.pow(2, i); 
            sum += term; 
            System.out.println("Element " + (i + 1) + ": " + term);
        }

        System.out.println("\nSuma pierwszych " + n + " elementów: " + sum);
    }
}
