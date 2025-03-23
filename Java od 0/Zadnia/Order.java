import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {
    int id;
    String customerName;
    double amount;

    public Order(int id, String customerName, double amount) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
    }

    public String toString() {
        return "Order{id=" + id + ", customerName='" + customerName + "', amount=" + amount + "}";
    }
}

public class SystemZamowien {
    public static void main(String[] args) {

        List<Order> zamowienia = new ArrayList<>();
        zamowienia.add(new Order(1, "Jan Kowalski", 100.0));
        zamowienia.add(new Order(2, "Anna Nowak", 250.0));
        zamowienia.add(new Order(3, "Jan Kowalski", 200.0));
        zamowienia.add(new Order(4, "Maria Zielińska", 300.0));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę klienta: ");
        String klient = scanner.nextLine();

        double suma = 0;
        boolean znaleziono = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę klienta: ");
        String klient = scanner.nextLine();

        double suma = 0;
        boolean znaleziono = false;

        for (Order zamowienie : zamowienia) {
            if (zamowienie.customerName.equalsIgnoreCase(klient)) {
                System.out.println(zamowienie); 
                suma += zamowienie.amount;
                znaleziono = true;
            }
        }

        if (znaleziono) {
            System.out.println("Łączna wartość zamówień: " + suma);
        } else {
            System.out.println("Nie znaleziono zamówień dla podanego klienta.");
        }

        scanner.close();
    }
}

