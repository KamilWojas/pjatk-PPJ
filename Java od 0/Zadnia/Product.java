import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + " – " + String.format("%.2f", price) + " zł";
    }
}

public class SortowanieProduktow {
    public static void main(String[] args) {
        List<Product> produkty = new ArrayList<>();
        produkty.add(new Product("Chleb", 3.50));
        produkty.add(new Product("Mleko", 4.20));
        produkty.add(new Product("Masło", 7.00));
        produkty.add(new Product("Ser", 6.50));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sortować wg ceny rosnąco/malejąco? ");
        String kierunek = scanner.nextLine().toLowerCase();