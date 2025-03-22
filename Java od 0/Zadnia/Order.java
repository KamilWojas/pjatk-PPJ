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
