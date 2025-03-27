import java.util.Scanner;

public class FormatTelefonu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj 9-cyfrowy numer telefonu: ");
        String numer = scanner.nextLine().replaceAll("\\s+", "");
    }