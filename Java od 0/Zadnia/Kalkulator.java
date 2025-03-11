import java.util.Scanner;


public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("\nWybierz operację:");
            System.out.println("1. Dodawanie (+)");
            System.out.println("2. Odejmowanie (-)");
            System.out.println("3. Mnożenie (*)");
            System.out.println("4. Dzielenie (/)");
            System.out.println("5. Potęgowanie (^)");
            System.out.println("6. Pierwiastek kwadratowy (√)");
            System.out.println("7. Zakończ program");

            int opcja = scanner.nextInt();
            