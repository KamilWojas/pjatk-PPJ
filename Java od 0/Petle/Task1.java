public class Task1 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 3) {
            switch (i) {
                case 0, 4, 6, 8:
                    System.out.print('a');
                    break;
                case 1, 3, 5:
                    System.out.print('b');
                    break;
                default:
                    System.out.print('c');
            }
            System.out.print(
                    switch (i % 3) {
                        case 0 -> 'd';
                        case 1 -> 'e';
                        default -> 'f';
                    }
            );
            i++;
        }
    }
}