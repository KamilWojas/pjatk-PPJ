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
        System.out.print(matrix[i - 2][j + 1]);
    }
}

//    Możliwe odpowiedzi:
//        a) 99 88 77 22
//        b) 99 88 77 33
//        c) 99 77 66 22
//        d) 99 88 77 11
//        e) 99 88 77 44
//        f) Błąd wykonaniai