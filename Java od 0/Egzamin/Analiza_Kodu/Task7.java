public class Task7 {
    public static void main(String[] args) {
        int x = 4;
        {
            int y = 9;
            System.out.print(y + " " + (x++) + " ");
            x += y;
        }
    }