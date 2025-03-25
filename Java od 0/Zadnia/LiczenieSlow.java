import java.util.*;

public class LiczenieSlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");
        String zdanie = scanner.nextLine().toLowerCase();

        String[] slowa = zdanie.split("\\s+"); 
        Map<String, Integer> licznik = new HashMap<>();