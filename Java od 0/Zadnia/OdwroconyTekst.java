import java.util.Scanner;

public class OdwroconyTekst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        String odwrocony = odwrocTekst(tekst);

        System.out.println("Odwrócony tekst: " + odwrocony);

        scanner.close();
    }

    
    public static String odwrocTekst(String tekst) {
        return new StringBuilder(tekst).reverse().toString();
    }
}



