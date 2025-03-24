import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " – " + String.format("%.2f", salary);
    }
}
public class SystemPracownikow {
    public static void main(String[] args) {
       
        List<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(new Employee(1, "Anna Nowak", "HR", 5000));
        pracownicy.add(new Employee(2, "Jan Kowalski", "IT", 6500));
        pracownicy.add(new Employee(3, "Kamil Zieliński", "HR", 4700));
        pracownicy.add(new Employee(4, "Marta Wiśniewska", "IT", 7100));
        pracownicy.add(new Employee(5, "Piotr Maj", "Marketing", 4300));

        Scanner scanner = new Scanner(System.in);