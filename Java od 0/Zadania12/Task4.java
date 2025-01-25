public class Task4 {

    public static void main(String[] args) {

        int a = 10;
        {
            int b = 15;
            System.out.println(b + " " + a + " ");

            b += 2;
            a = b;
        }

        int b = 20;
        System.out.println(b + " " + a + " ");
    }
}