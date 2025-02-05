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

//    Możliwe odpowiedzi:
//        a) 15 10 5 25
//        b) 30 25 20 10
//        c) 15 10 5 20
//        d) 45 40 35 30
//        e) 15 10 5 30
//        f) Błąd kompilacji
