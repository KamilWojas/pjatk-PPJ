package ZadaniaCwiczeina5;

import java.util.Scanner;

public class Task0505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt(),
                month = scanner.nextInt();

        if (
                month == 1 ||
                        month ==2 ||
                        month == 3 ||
                        month == 4 ||
                        month == 5 ||
                        month == 6 ||
                        month == 7 ||
                        month == 8 ||
                        month == 9 ||
                        month == 10 ||
                        month == 11 ||
                        month == 12

        )
            System.out.println(31);

        else
            if (month == 2){
                if (year%4 ==0 && (year%100 !=0 || year %400 == 0))
                    System.out.println(29);
                else
                    System.out.println(28);
            }else
                System.out.println(30);

    }
}
