package ZadaniaCwiczeina5;

import java.util.Scanner;

public class Task0506 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź uzyskaną ilość punktów: ");
        double uzyskanPunkty = scanner.nextDouble();

        System.out.print("Wprowadź maksymalną ilość punktów możliwych do uzyskania: ");
        double maxPunktów = scanner.nextDouble();

        double procenty = (uzyskanPunkty / maxPunktów) * 100;

        if (procenty >= 90) {
            System.out.println("Twoja ocena to: 5.0");
        } else if (procenty >= 80 ) {
            System.out.println("Twoja ocena to: 4.5");
        } else if (procenty >= 70) {
            System.out.println("Twoja ocena to: 4.0");
        } else if (procenty >= 60) {
            System.out.println("Twoja ocena to: 3.5");
        } else if (procenty >= 50) {
            System.out.println("Twoja ocena to: 3.0");
        } else {
            System.out.println("Twoja ocena to: 2.0");
        }
    }
}
