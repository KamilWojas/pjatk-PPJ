public class Main {
    public static void main(String[] args) {

        int x = 5;
        {
            int y = 10;
            System.out.print(y++ + " " + x + " ");
            x += y;
        }
        int y = 20;

    }