class Pracownik {
    private String imie;
    private Projekt projekt;
    private Dzial dzial;

    public Pracownik(String imie) {
        this.imie = imie;
    }

    public void przypiszDoProjektu(Projekt projekt) {
        if (this.dzial != null) {
            throw new IllegalStateException("Pracownik już należy do działu i nie może być przypisany do projektu.");
        }
        this.projekt = projekt;
        projekt.dodajPracownika(this);
    }