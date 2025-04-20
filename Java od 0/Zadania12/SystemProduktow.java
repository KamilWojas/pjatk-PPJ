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