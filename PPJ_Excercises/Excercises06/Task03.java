import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }

        int count0 = 0;
        int count1 = 0;

        for (int i : array) {
            if (i == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        System.out.println("Number of 0s: " + count0);
        System.out.println("Number of 1s: " + count1);
    }
}
