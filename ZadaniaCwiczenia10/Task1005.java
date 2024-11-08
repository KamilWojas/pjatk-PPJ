package ZadaniaCwiczenia10;

public class Task1005 {
    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(1, 3, 5));
        System.out.println(findMax(50, 40, 30));
        System.out.println(findMax(20, 60, 101));
    }
}
