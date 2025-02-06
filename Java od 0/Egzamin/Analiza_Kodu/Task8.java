public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        int i = 2, j;
        for (j = 2; j >= 0; j--) {
            System.out.print(matrix[i][j] + " ");
        }

    }