import java.util.Random;
import java.util.Scanner;

public class ParzystaNieparzystaGra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Podaj liczbę od 1 do 10: ");
        int gracz = scanner.nextInt();

        if (gracz < 1 || gracz > 10) {
            System.out.println("Błędna liczba!");
            scanner.close();
            return;
        }
