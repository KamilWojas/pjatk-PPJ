public class Task7 {
    public static void main(String[] args) {


        int tab[][] = {
                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 }
            };

        int i = 1;
        for (; i < 4; i++) {

            System.out.print(tab[i][i]);

        }
        System.out.print(tab[i - 1]);
    }
}