public class Main {
    public static void main(String[] args) {
        int x = 8;
        {
            int y = 4;
            System.out.print(++y + " " + x + " ");
            x = y * 2;
        }
    }