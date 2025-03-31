import java.util.Scanner;

public class KalkulatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoją wagę (w kg): ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj swój wzrost (w metrach): ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.printf("Twoje BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi < 25) {
            System.out.println("Waga prawidłowa");
        } else if (bmi < 30) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Otyłość");
        }

        scanner.close();
    }
}