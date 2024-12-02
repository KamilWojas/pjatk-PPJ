package Zadanie8;

import java.util.Scanner;

public class Zadnie01 {

    public static void show(int value) {
        System.out.println("Dostarczona wartość: " + value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość typu int: ");
        int userInput = scanner.nextInt();

        show(userInput);

        scanner.close();
    }
}