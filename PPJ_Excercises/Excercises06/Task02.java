import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
