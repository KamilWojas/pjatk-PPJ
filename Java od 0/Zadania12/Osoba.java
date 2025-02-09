public class Osoba {

    static int liczbaOsobWsystemie;
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int rokSmierci;
    private float nrPesel;

    public Osoba(String imieKonkretnejOsoby
            , String nazwiskokonkretnejOsoby
            , int rokUrodzeniaKonkretnejOsoby,
                 float nrPeselKonkretnejOsby) {
        this.imie = imieKonkretnejOsoby;
        this.nazwisko = nazwiskokonkretnejOsoby;
        this.rokUrodzenia = rokUrodzeniaKonkretnejOsoby;
        this.nrPesel = nrPeselKonkretnejOsby;
        liczbaOsobWsystemie++;
    }

    public Osoba(String imieKonkretnejOsoby
            , String nazwiskoKonkrentejOosby
            , int rokUrodzeniaKonkrentejOsoby,
                 int rokSmierciKonkretnejOsoby,
                 float nrPeselKonkretnejOsoby) {

        this.imie = imieKonkretnejOsoby;
        this.nazwisko = nazwiskoKonkrentejOosby;
        this.rokUrodzenia = rokUrodzeniaKonkrentejOsoby;
        this.rokSmierci = rokSmierciKonkretnejOsoby;
        this.nrPesel = nrPeselKonkretnejOsoby;
        liczbaOsobWsystemie++;
    }

    public String getImie() {
        return this.imie;
    }

    public Float getNrPesel() {
        return this.nrPesel;

    }

    public int obliczWiek() {
        if (rokSmierci != 0) {
            return rokSmierci - rokUrodzenia;
        } else {
            return 2024 - rokUrodzenia;
        }

    }
}