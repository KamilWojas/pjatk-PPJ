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

            switch (wybor) {
                case "1":
                    System.out.print("Nazwa produktu: ");
                    String name = scanner.nextLine();
                    System.out.print("Kategoria: ");
                    String category = scanner.nextLine();
                    System.out.print("Cena: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    produkty.add(new Product(name, category, price));
                    System.out.println("Dodano!");
                    break;

                case "2":
                    if (produkty.isEmpty()) {
                        System.out.println("Brak produktów.");
                    } else {
                        for (Product p : produkty) {
                            System.out.println(p);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Podaj kategorię: ");
                    String szukanaKategoria = scanner.nextLine();
                    boolean znaleziono = false;
                    for (Product p : produkty) {
                        if (p.category.equalsIgnoreCase(szukanaKategoria)) {
                            System.out.println(p);
                            znaleziono = true;
                        }
                    }
                    if (!znaleziono) {
                        System.out.println("Brak produktów w tej kategorii.");
                    }
                    break;


                case "4":
                    System.out.println("Zakończono.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Nieprawidłowa opcja.");
            }
        }
    }
}