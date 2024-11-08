package Zagnieżdżone;

import java.util.Scanner;

public class LiczbaPierwsza {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Możesz zmienić tę wartość
          */
        int n = 5;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " jest liczbą pierwszą.");
            }
        }
    }
}

