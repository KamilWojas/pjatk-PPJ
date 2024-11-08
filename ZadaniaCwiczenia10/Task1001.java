package ZadaniaCwiczenia10;

public class Task1001 {
    public static void main(String[] args) {

        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };



        int wszystkieElementy = 0;
        for (int[] innerArray : tab) {
            wszystkieElementy += innerArray.length;
        }

        int[] flatArray = new int[wszystkieElementy];

        int index = 0;
        for (int[] innerArray : tab) {
            for (int element : innerArray) {

                flatArray[index++] = element;

            }
        }

        for (int element : flatArray) {
            System.out.print(element + " ");
        }
    }
}

