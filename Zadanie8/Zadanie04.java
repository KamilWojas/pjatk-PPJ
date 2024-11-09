package Zadanie8;

import java.util.Random;

public class Zadanie04 {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(100);
            array2[i] = rand.nextInt(100);
        }

        int[] result = processArrays(array1, array2, 5);

        if (result != null) {
            for (int value : result) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Wynik: null");
        }
    }

    public static int[] processArrays(int[] array1, int[] array2, int value) {
        if (array1.length != array2.length) {
            return null;
        }

        int[] result;

        if (value < 0) {
            result = new int[array1.length];
            int index = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != 0 && array2[i] != 0) {
                    result[index++] = array1[i] + array2[i];
                }
            }
            return trimArray(result, index);
        }
        else if (value > 0) {
            int nonZeroCount = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0 || array2[i] == 0) {
                    nonZeroCount++;
                }
            }
            result = new int[nonZeroCount];
            int index = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0 || array2[i] == 0) {
                    result[index++] = array1[i] == 0 ? array2[i] : array1[i];
                }
            }
            return result;
        }
        else {
            return null;
        }
    }

    private static int[] trimArray(int[] array, int newSize) {
        int[] trimmedArray = new int[newSize];
        System.arraycopy(array, 0, trimmedArray, 0, newSize);
        return trimmedArray;
    }
}
