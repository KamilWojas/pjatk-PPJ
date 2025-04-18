import java.time.LocalDate;

class Employee {
    private String hireDate;
    private double baseSalary;

    public Employee(String hireDate, double baseSalary) {
        this.hireDate = hireDate;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(int period) {
        return baseSalary * period;
    }
}

class FirmCustomer {
    private String nip;

    public FirmCustomer(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }
}

class PrivateCustomer {
    private String pesel;

    public PrivateCustomer(String pesel) {
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }
}

class Customer extends Employee {
    private FirmCustomer firmCustomer;
    private PrivateCustomer privateCustomer;

    public Customer(String hireDate, double baseSalary) {
        super(hireDate, baseSalary);
    }

    public void setFirmCustomer(FirmCustomer firmCustomer) {
        this.firmCustomer = firmCustomer;
    }
    public void setPrivateCustomer(PrivateCustomer privateCustomer) {
        this.privateCustomer = privateCustomer;
    }

    public String getNip() {
        return firmCustomer != null ? firmCustomer.getNip() : "Brak NIP";
    }

    public String getPesel() {
        return privateCustomer != null ? privateCustomer.getPesel() : "Brak PESEL";
    }
}

public class Task33 {
    public static void main(String[] args) {
        Customer client = new Customer("2023-01-10", 5000);

        client.setPrivateCustomer(new PrivateCustomer("12345678901"));
        client.setFirmCustomer(new FirmCustomer("9876543210"));

        System.out.println("PESEL: " + client.getPesel());
        System.out.println("NIP: " + client.getNip());
        System.out.println("Wynagrodzenie za 3 miesiące: " + client.calculateSalary(3));
    }
}