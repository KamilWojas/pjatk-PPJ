import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class History {
    private String imie;
    private String nazwisko;
    private List<Czlonkowstwo> historiaCzlonkostwa = new ArrayList<>();

    public History(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void dodaDoGrupy(Grupa grupa, Date dataRozpoczecia){
        Czlonkostwo czlonkostwo = new Czlonkostwo(this, grupa, dataRozpoczecia);
        historiaCzlonkostwa.add(czlonkostwo);
        grupa.dodajCzlonkostwo(czlonkostwo);
    }
}