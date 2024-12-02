package PetlaWhile;

import java.util.Scanner;

public class Gwiazki {

    public static void main(String[] args) {

        int liczbaGwiazdek = getInt();

        if (liczbaGwiazdek > 1) {
            do {
                System.out.println("*");
                liczbaGwiazdek--;
            } while (liczbaGwiazdek > 1);
            }
        }

    public static int getInt() {
    return new Scanner(System.in).nextInt();
    }

}
