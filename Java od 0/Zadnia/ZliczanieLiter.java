import java.util.Scanner;

public class ZliczanieLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine().toLowerCase();

        System.out.print("Podaj literę do zliczenia: ");
        char litera = scanner.nextLine().toLowerCase().charAt(0);

        int licznik = 0;
        for (char znak : tekst.toCharArray()) {
            if (znak == litera) {
                licznik++;
            }
        }

        System.out.println("Litera '" + litera + "' występuje " + licznik + " razy.");

        scanner.close();
    }
}