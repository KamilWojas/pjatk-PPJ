package ZadaniaCwiczenia9;

public class Task0902 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3};

        if (array != null && array.length >= 2) {
            System.out.println("Liczba różnych wartości: " + countUniqueValues(array));
        } else {
            System.out.println("Tablica musi zawierać co najmniej 2 elementy");
        }
    }

    public static int countUniqueValues(int[] array) {
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                count++;
            }
        }
        return count;
    }
}