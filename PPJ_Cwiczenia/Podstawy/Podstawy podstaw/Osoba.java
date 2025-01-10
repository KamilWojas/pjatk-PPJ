public class Osoba {

    static int liczbaOsobWsystemie;

    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int rokSmierci;

    public Osoba (String imieKonkretnejOsoby
            , String nazwiskokonkretnejOsoby
            , int rokUrodzeniaKonkretnejOsoby)
    {
        this.imie = imieKonkretnejOsoby;
        this.nazwisko = nazwiskokonkretnejOsoby;
        this.rokUrodzenia = rokUrodzeniaKonkretnejOsoby;
        liczbaOsobWsystemie++;
    }