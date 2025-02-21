import java.time.LocalDate;
import java.time.Period;

public class Pochodny {
    private String imie;
    private LocalDate dataUrodzenia; //Atrybut pochodny

    public Pochodny(String imie, LocalDate dataUrodzenia){
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    //Atrybut pochodny - wiek
    public int getWiek(){
        return Period.between(dataUrodzenia, LocalDate.now()).getYears();

    }
    //Mtoda wyświetlająca informcje o osobie
    public void wyswietlInformacje(){
        System.out.println("Imię: " + imie);
        System.out.println("Datat urodzenia: " + dataUrodzenia);
        System.out.println("Wiek: " + getWiek());

    }
}

//test klasy
public class Main{
    public static void main(String[] args) {
        Osoba osoba = new Pochodny("Jan", LocalDate.of(1987, 5, 12));
    }
}