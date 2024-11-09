package Zadanie8;

public class Zadanie02 {
    public static void modifyValue(int value) {
        System.out.println("Początkowa wartość: " + value);

        value = value * 5;

        System.out.println("Zmodyfikowana wartość: " + value);
    }

    public static void main(String[] args) {
        int wrt = 5;

        System.out.println("Wartość wrt przed wywołaniem modifyValue: " + wrt);

        modifyValue(wrt);

        System.out.println("Wartość wrt po wywołaniu modifyValue: " + wrt);
    }
}

//Wartość zmiennej wrt w metodzie main nie zmienia się po wywołaniu metody modifyValue,
// ponieważ w Java zmienne typu podstawowego (takie jak int) są przekazywane przez wartość.