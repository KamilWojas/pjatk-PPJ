public class Tab2 {
    public static void main(String[] args) {

        int[][] numbers = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}
        };

        int i = 0, j;
        for (j = 2; j >= 0; j--) {
            System.out.print(numbers[i][j] + " ");
        }
        System.out.print(numbers[i + 1][j + 1]);
    }
}
