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

    public Osoba( String imieKonkretnejOsoby
            ,String nazwiskoKonkrentejOosby
            ,int rokUrodzeniaKonkrentejOsoby,
                  int rokSmierciKonkretnejOsoby){
        this.imie = imieKonkretnejOsoby;
        this.nazwisko = nazwiskoKonkrentejOosby;
        this.rokUrodzenia = rokUrodzeniaKonkrentejOsoby;
        this.rokSmierci = rokSmierciKonkretnejOsoby;
        liczbaOsobWsystemie++;
    }
    
    public String getImie(){
        return this.imie;
    }


}