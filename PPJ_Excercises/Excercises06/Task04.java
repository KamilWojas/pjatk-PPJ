import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        double[] array = new double[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 10;
        }

        System.out.println("Full array:");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Values at even indexes:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Elements with odd int values:");
        for (double num : array) {
            int intValue = (int) num;
            if (intValue % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
