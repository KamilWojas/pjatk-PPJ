package Zagnieżdżone;

import java.util.Scanner;

public class SumyKwadratów {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Możesz zmienić tę wartość

        for (int i = 1; i <= n; i++) {
            int sumOfSquares = 0;
            for (int j = 1; j <= i; j++) {
                sumOfSquares += j * j;
            }
            System.out.println("Suma kwadratów liczb od 1 do " + i + " wynosi: " + sumOfSquares);
        }
    }
}

