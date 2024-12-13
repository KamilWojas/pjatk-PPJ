public class Task03 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Pętla while:");
        while (x < 5) { // Warunek jest sprawdzany na początku
            System.out.println("Wartość x: " + x);
            x++;
        }

        System.out.println("\nPętla do-while:");
        do {
            System.out.println("Wartość x: " + x); 
            x++;
        } while (x < 5); // Warunek jest sprawdzany na końcu
    }
}
