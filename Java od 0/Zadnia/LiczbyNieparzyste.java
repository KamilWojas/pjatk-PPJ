import java.util.Scanner;

public class LiczbyNieparzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj b: ");
        int b = scanner.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        System.out.print("Nieparzyste liczby: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + (i < end - 1 ? ", " : ""));
            }
        }

        scanner.close();
    }
}
