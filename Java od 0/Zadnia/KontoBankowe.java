import java.util.ArrayList;
import java.util.Scanner;

class KontoBankowe{
    private String numerKonta;
    private String wlasciciel;
    private double saldo;
    
    public KontoBankowe(String numerKonta, String wlasciciel, double saldo){
     this.numerKonta = numerKonta;
     this.wlasciciel = wlasciciel;
     this.saldo = saldo;
    }

    public void wplac(double kwota){
        if (kwota > 0){
            saldo += kwota;
            System.out.println("Wpłacono " + kwota + ". Nowe saldo: " + saldo);
        } else {
            System.out.println("Niepoprawna kwota!");
        }
    }
    
    public void wyplac(double kwota){
        if (kwota > 0 && kwota <= saldo){
            saldo -= kwota;
            System.out.println("Wyplacono " + kwota + ". Nowe saldo: " + saldo);
        } else {
            System.out.println("Brak wystarczajacych środków lub niepoprawna kwota!");
        }
    }

    public String getNumerKonta(){
        return numerKonta + " - " + wlasciciel + "- Saldp " + saldo
    }

    public String getNumerKonta(){
        return numerKonta;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<KontoBankowe> konta = new ArrayList<>();

        while (true){
            System.out.println("\n Wybierz opcję: ");
            System.out.println("1. Stwórz nowe konto");
            System.out.println("2. Zarządzaj kontem");
            System.out.println("3. Wyświetl wszystie konta");
            System.out.println("4. Zakończ program");

            int opcja = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcja){
                case 1:
                    System.out.println("Podaj nr konta");
                    String numerKonta = scanner.nextLine();

                    System.out.println("Podaj nazwisko właściciela");
                    String wlasciciel = scanner.nextLine();

                    System.out.print("Podaj saldo początkowe: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine();

                    konta.add(new KontoBankowe(numerKonta, wlasciciel, saldo));
                    System.out.println("Konto zostało utworzone!");
                    break;

                case 2:
                    System.out.print("Podaj numer konta: ");
                    String szukaneKonto = scanner.nextLine();

                    KontoBankowe konto = null;
                    for (KontoBankowe k : konta) {
                        if (k.getNumerKonta().equals(szukaneKonto)) {
                            konto = k;
                            break;
                        }
                    }
            }
        }
    }
}