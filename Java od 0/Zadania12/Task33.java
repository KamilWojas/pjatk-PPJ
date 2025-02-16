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