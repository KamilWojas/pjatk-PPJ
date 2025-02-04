public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        {
            int b = 7;
            System.out.print((b++) + " " + a + " ");
            a = b;
        }
            int b = 12;
            System.out.print(b + " " + a);
    }
}