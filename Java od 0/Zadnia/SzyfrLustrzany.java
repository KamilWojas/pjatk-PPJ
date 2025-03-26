import java.util.Scanner;

public class SzyfrLustrzany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst do zaszyfrowania: ");
        String tekst = scanner.nextLine().toLowerCase();

        StringBuilder wynik = new StringBuilder();

        for (char znak : tekst.toCharArray()) {
            if (znak >= 'a' && znak <= 'z') {
                char lustrzana = (char) ('z' - (znak - 'a'));
                wynik.append(lustrzana);
            } else {
                wynik.append(znak); 
            }
        }

        System.out.println("Zaszyfrowany tekst: " + wynik);
        scanner.close();
    }
}