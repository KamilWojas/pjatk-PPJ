import java.util.ArrayList;
import java.util.List;

public class Powtarzalny {
    private String imie;
    private List<String> numerTelefonu; //Atrynut powtarzalny

    public Powtarzalny(String imie){
        this.imie = imie;
        this.numerTelefonu = new ArrayList<>();

    }
}