package ZadaniaCwiczenia7;

import java.util.Random;

public class Task0705 {

    public static void main(String[] args) {
        Random r = new Random();
        double[] tab = new double[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextDouble() * 100;
            System.out.println(tab[i]);
        }

        System.out.println("Elementy o indeksie parzystym:");
        for (int i = 0; i < tab.length; i += 2) {
            System.out.println(tab[i]);
        }

        System.out.println("Elementy o nieparzystej wartości po konwersji na int: ");
        for (double v : tab) {
            if ((int) v % 2 != 0) {
                System.out.println(v);
            }
        }
    }
}