import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class History {
    private String imie;
    private String nazwisko;
    private List<Członkowstwo> historiaCzłonkostwa = new ArrayList<>();

    public History(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void dodaDoGrupy(Grupa grupa, Date dataRozpoczecia){
        
    }
}