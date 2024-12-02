package ZadaniaCwiczenia10;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1002 {
    public static void main(String[] args) {

        Random rand = new Random();
        int wiersze = rand.nextInt(10) + 1;
        int kolumny = rand.nextInt(10) + 1;
        int[][] array = new int[wiersze][kolumny];

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }

        System.out.println("" + array.length);
        printArray(array);

        System.out.println("\nTablica bez duplikatów:");
        int rows = 0;
        for (int i = 0; i < rows; i++) {
            Set<Integer> uniqueValues = new HashSet<>();
            for (int value : array[i]) {
                uniqueValues.add(value);
                array[i] = uniqueValues.stream().mapToInt(Number::intValue).toArray();
            }
                for (int value : array[i]) {
                    System.out.print(value + " ");

                }
                System.out.println();
            System.out.println(" tablica jedno wymiarowa bez duplikatów");
            }
        System.out.println(" " + array.length);
        System.out.println(" " + wiersze);
        System.out.println(" " + kolumny);

        }



    private static void printArray(int[][] array) {

    }
}
