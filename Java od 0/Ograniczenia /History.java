import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class History {
    private String imie;
    private String nazwisko;
    private List<Czlonkowstwo> historiaCzlonkostwa = new ArrayList<>();

    public History(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodaDoGrupy(Grupa grupa, Date dataRozpoczecia) {
        Czlonkostwo czlonkostwo = new Czlonkostwo(this, grupa, dataRozpoczecia);
        historiaCzlonkostwa.add(czlonkostwo);
        grupa.dodajCzlonkostwo(czlonkostwo);
    }

    public void opuscGrupe(Grupa grupa, Date dataZakonczenia) {
        for (Czlonkostwo czlonkostwo : historiaCzlonkostwa) {
            if (czlonkostwo.getGrupa().equals(grupa) && czlonkostwo.getDataZakonczenia() == null) {
                czlonkostwo.setDataZakonczenia(dataZakonczenia);
                break;
            }
        }
    }
}

class Grupa {
    private String nazwa;
    private List<Czlonkostwo> czlonkowie = new ArrayList<>();

    public Grupa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajCzlonkostwo(Czlonkostwo czlonkostwo) {
        czlonkowie.add(czlonkostwo);
    }
}

class Czlonkostwo{
    private Pracownik pracownik;
    private Grupa grupa;
    private Date dataRozpoczecia;
    private Date dataZakonczenia;

    public Czlonkostwo(Pracownik pracownik, Grupa grupa, Date dataRozpoczecia){
        this.pracownik = pracownik;
        this.grupa = grupa;
        this.dataRozpoczecia = dataRozpoczecia;
    }
}
    