public class Task34 {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan Kowalski");
        Projekt projekt1 = new Projekt("Projekt AI");
        Dzial dzial1 = new Dzial("IT");

        pracownik1.przypiszDoProjektu(projekt1);
        pracownik1.wyswietlInformacje();