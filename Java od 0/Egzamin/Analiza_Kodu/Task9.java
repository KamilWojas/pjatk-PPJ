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
        System.out.print(array[i - 1][j - 1]);
    }
}


//    Możliwe odpowiedzi:
//        a) 6 4 8
//        b) 6 2 8
//        c) 6 4 7
//        d) 6 2 7
//        e) 9 5 7
//        f) Błąd mechaniczny

