public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int i = 1, j;
        for (j = 0; j < 3; j += 2) {
            System.out.print(array[i][j] + " ");
        }

    }