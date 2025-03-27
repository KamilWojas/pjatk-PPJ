import java.util.Scanner;

public class FormatTelefonu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj 9-cyfrowy numer telefonu: ");
        String numer = scanner.nextLine().replaceAll("\\s+", "");
        
        if (numer.matches("\\d{9}")) {
            String sformatowany = numer.substring(0, 3) + "-" +
                    numer.substring(3, 6) + "-" +
                    numer.substring(6);
            System.out.println("Sformatowany numer: " + sformatowany);
        } else {
            System.out.println("Błędny numer – musi zawierać dokładnie 9 cyfr.");
        }

        scanner.close();
    }
} 