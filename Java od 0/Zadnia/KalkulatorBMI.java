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