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
        Subset pracownik1 = new Subset("Jan", "Kowalski");
        Projekt projekt1 = new Projekt("Projekt A", 18900);

        pracownik1.dodajProjekt(projekt1);

        try {
            projekt1.ustawMenadżera(projekt1);
            System.out.println(pracownik1.getImię() + " został menadżerem projektu " + projekt1.getNazwa());
        }
    }
}