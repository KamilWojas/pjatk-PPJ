public class Osoba {

    static int liczbaOsobWsystemie;

    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int rokSmierci;
    private int nrPesel;

    public Osoba (String imieKonkretnejOsoby
            , String nazwiskokonkretnejOsoby
            , int rokUrodzeniaKonkretnejOsoby, int nrPeselKonkretnejOsby)
    {
        this.imie = imieKonkretnejOsoby;
        this.nazwisko = nazwiskokonkretnejOsoby;
        this.rokUrodzenia = rokUrodzeniaKonkretnejOsoby;
        this.nrPesel = nrPeselKonkretnejOsby;
        liczbaOsobWsystemie++;
    }

    public Osoba( String imieKonkretnejOsoby
            ,String nazwiskoKonkrentejOosby
            ,int rokUrodzeniaKonkrentejOsoby,
                  int rokSmierciKonkretnejOsoby,
                  int nrPeselKonkretnejOsoby){

        this.imie = imieKonkretnejOsoby;
        this.nazwisko = nazwiskoKonkrentejOosby;
        this.rokUrodzenia = rokUrodzeniaKonkrentejOsoby;
        this.rokSmierci = rokSmierciKonkretnejOsoby;
        this.nrPesel = nrPeselKonkretnejOsoby;
        liczbaOsobWsystemie++;
    }
    
    public String getImie(){
        return this.imie;
    }


}