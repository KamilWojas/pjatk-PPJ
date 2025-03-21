import java.util.Scanner;

public class TylkoCyfry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        boolean tylkoCyfry = tekst.matches("\\d+");

        if (tylkoCyfry) {
            System.out.println("Tekst zawiera tylko cyfry.");
        } else {
            System.out.println("Tekst NIE zawiera tylko cyfr.");
        }

        scanner.close();
    }
}
