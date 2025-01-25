public class Task2 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(
                    arr[i % 3 == 0 ? arr.length - 1 - i : i]
        };
    }
}

