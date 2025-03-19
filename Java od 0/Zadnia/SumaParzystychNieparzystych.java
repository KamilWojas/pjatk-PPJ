
import java.util.Scanner;

public class SumaParzystychNieparzystych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość liczb: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ilość liczb musi być większa niż 0!");
            return;
        }

        int sumaParzystych = 0;
        int sumaNieparzystych = 0;