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