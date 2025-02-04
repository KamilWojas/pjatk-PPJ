public class Task6 {
    public static void main(String[] args) {
        int a = 2;
        {
            int b = 6;
            System.out.print(b + " " + (++a) + " ");
            a += b;
        }
    }