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
        }
    }
}