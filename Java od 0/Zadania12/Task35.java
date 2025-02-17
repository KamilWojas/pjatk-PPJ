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
    public void przypiszDoDzialu(Dzial dzial) {
        if (this.projekt != null) {
            throw new IllegalStateException("Pracownik już należy do projektu i nie może być przypisany do działu.");
        }
        this.dzial = dzial;
        dzial.dodajPracownika(this);
    }
    public void wyswietlInformacje() {
        System.out.println("Pracownik: " + imie);
        if (projekt != null) {
            System.out.println("Pracuje w projekcie: " + projekt.getNazwa());
        } else if (dzial != null) {
            System.out.println("Pracuje w dziale: " + dzial.getNazwa());
        } else {
            System.out.println("Nie jest przypisany do żadnego projektu ani działu.");
        }
    }
}
class Projekt {
    private String nazwa;

    public Projekt(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void dodajPracownika(Pracownik pracownik) {
        System.out.println("Pracownik dodany do projektu: " + nazwa);
    }
}
class Dzial {
    private String nazwa;

    public Dzial(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

