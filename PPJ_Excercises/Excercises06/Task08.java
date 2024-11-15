import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        char[] originalArray = new char[size];
        char[] mirroredArray = new char[size];
        Random random = new Random();

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = (char) (random.nextInt(26) + 'A');
        }

        for (int i = 0; i < originalArray.length; i++) {
            mirroredArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.print("Original Array: ");
        for (char c : originalArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Mirrored Array: ");
        for (char c : mirroredArray) {
            System.out.print(c + " ");
        }
    }
}
