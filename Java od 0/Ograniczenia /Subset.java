public class Subset {
    private String imie;
    private String nazwisko;
    private Set<Projekt> projekty = new HashSer<>();

    private void dodajProjekt(Projekt projekt){
        projekty.add(projekt);
        projekt.dodajUczestnika(this);
    }

    public boolean jestUczestnikiem(Projekt projekt){
        return projekty.contains(projekt);
    }
}

public class Projekt{
    private String imie;
    private double budżet;
    private Set<Pracownik> uczestnicy = new HashSet<>();
    private Pracownik menadżer;

    public void dodajUczestnika(Pracownik pracownik){
        uczestnicy.add(pracownik);
    }

    public void ustawMenadżera(Pracownik pracownik){
        if (!uczestnicy.contains(pracownik)){
            throw new IllegalArgumentException("Pracownik nie może być uczestnikiem projektu, aby zostać menadżerem");
        }
        this.menadżer = pracownik;
    }
}

public class Main{
    public static void main(String[] args) {
        
    }
}