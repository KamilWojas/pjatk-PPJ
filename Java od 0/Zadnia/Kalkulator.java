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

            if (opcja == 7) {
                System.out.println("Zamykanie programu...");
                break;
            }

            double liczba1, liczba2, wynik = 0;

            if (opcja >= 1 && opcja <= 5) {
                System.out.print("Podaj pierwszą liczbę: ");
                liczba1 = scanner.nextDouble();
                System.out.print("Podaj drugą liczbę: ");
                liczba2 = scanner.nextDouble();
            } else if (opcja == 6) {
                System.out.print("Podaj liczbę: ");
                liczba1 = scanner.nextDouble();
                liczba2 = 0; 
            } else {
                System.out.println("Niepoprawna opcja! Wybierz ponownie.");
                continue;
            }

            switch (opcja) {
                case 1: 
                    wynik = liczba1 + liczba2;
                    System.out.println("Wynik: " + liczba1 + " + " + liczba2 + " = " + wynik);
                    break;
                case 2: 
                    wynik = liczba1 - liczba2;
                    System.out.println("Wynik: " + liczba1 + " - " + liczba2 + " = " + wynik);
                    break;
                case 3: 
                wynik = liczba1 * liczba2;
                System.out.println("Wynik: " + liczba1 + " * " + liczba2 + " = " + wynik);
                    break;
                case 4: 
                    if (liczba2 == 0) {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                    } else {
                        wynik = liczba1 / liczba2;
                        System.out.println("Wynik: " + liczba1 + " / " + liczba2 + " = " + wynik);
                    }
                    break;
                case 5: 
                    wynik = Math.pow(liczba1, liczba2);
                    System.out.println("Wynik: " + liczba1 + " ^ " + liczba2 + " = " + wynik);
                    break;
                
            }
