package ZadaniaCwiczeina5;

import java.util.Scanner;

public class Task0503 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj znak");
        char znak = scanner.next().charAt(0);


        if (znak == 'a' || znak == 'ą') {
            System.out.println("To jest samogłoska ");
        }else
            System.out.println("To nie jest samogłoska");

    }

}


