package ZadaniaCwiczenia6;

import java.util.Scanner;

public class Task0603 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer studenta: ");

        int eska = scanner.nextInt();

        long suma = 0;

        for (int i = 0; i <= eska; i++) {
            suma += i;
        }

        System.out.println("Suma liczb od 0 do " + eska + " wynosi: " + suma);
    }
}