import java.util.Scanner;

public class SredniaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile liczb chcesz podać? ");
        int n = scanner.nextInt();

        double suma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj liczbę " + i + ": ");
            double liczba = scanner.nextDouble();
            suma += liczba; 
        }

        double srednia = suma / n; 
        System.out.println("Średnia arytmetyczna: " + srednia);

        scanner.close();
    }
}