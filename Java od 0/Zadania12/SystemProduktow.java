import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - " + price + " zł";
    }
}

public class SystemProduktow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> produkty = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj produkt");
            System.out.println("2. Wyświetl wszystkie produkty");
            System.out.println("3. Filtruj po kategorii");
            System.out.println("4. Zakończ");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();