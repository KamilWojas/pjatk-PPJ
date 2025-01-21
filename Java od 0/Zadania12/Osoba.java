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