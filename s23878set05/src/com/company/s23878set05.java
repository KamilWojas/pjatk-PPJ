package com.company;

import java.util.Scanner;

public class s23878set05 {

    public static void main(String[] args) {
	// write your code here
    }
    public void task01(){
    /*Program  przeprowadza iteracyjnie operację dzielenia całkowitego zmiennej K przez 10,
     aby wyodrębnić jej kolejne cyfry, a następnie dodaje je do zmiennej typu String o nazwie s.
      Powtarza się to do momentu, gdy zmienna K osiągnie wartość 0.
      Rezultatem będzie zmienna s zawierająca odwrócony napis reprezentujący początkową wartość zmiennej K.
      Rezultatem będzie 123456789.
     */
    }
    public void task02(){
        int s = 0;
        int i = 1;
        while (i <= 10) {
            s += i;
            i++;
        }
        System.out.println("Suma liczb od 1 do 10 to: " + s);
    }
    public void task03(){
        int s = 0;
        int i = 1;
        while (i <= 10) {
            s += i;
            i++;
        }
        System.out.println("Suma liczb od 1 do 10 to: " + s);
    }
    public void task04(){
        Scanner scanner = new Scanner(System.in);

        // Pętla while
        int i = 1;
        while (i <= 0) {
            System.out.println("Nie wyświetlę się");
        }

        // Pętla do-while
        int j = 1;
        do {
            System.out.println("Wyświetlę się przynajmniej raz");
        } while (j <= 0);

        scanner.close();
    }
    public void task05(){
        double q = 2;
        double a0 = 1;

        System.out.println("10 pierwszych wyrazów szeregu geometrycznego o ilorazie " + q + " i pierwszym wyrazie " + a0 + ":");
        for (int n = 0; n < 10; n++) {
            double an = a0 * Math.pow(q, n);
            System.out.println(an);
        }

    }
    public void task06(){
        int wrt = 2;
        double xn = 1;

        for (int n = 1; n <= 10; n++) {
            xn *= 0.5;
            double wynik = xn * wrt;
            System.out.println("X" + n + " = " + wynik);
        }
    }
    public void task07(){
        for (int i = -1500; i <= 1500; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public void task08(){
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void task09(){
        char[] directions = {'↑', '→', '↓', '←'};
        int currentDirection = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Aktualny kierunek: " + directions[currentDirection]);
        while (true) {
            System.out.print("Podaj kierunek (A - w lewo, D - w prawo): ");
            char c = in.next().charAt(0);

            if (c == 'A') {
                currentDirection = (currentDirection + 3) % 4;
            } else if (c == 'D') {
                currentDirection = (currentDirection + 1) % 4;
            } else {
                System.out.println("Nieprawidłowy kierunek!");
                continue;
            }
            System.out.println("Aktualny kierunek: " + directions[currentDirection]);
        }
    }
}



