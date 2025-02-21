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
        
    }
}