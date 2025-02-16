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