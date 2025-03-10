class Ksiazka{
    private String tytul;
    private String autor;
    private int rokWydania;
    private boolean dostepne;

    public Ksiazka(String tytul, String autor, int rokWydania, boolean dostepne){
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.dostepne = true;
    }

    public boolean wypozycz(){
        if (dostepne){
            dostepne = true;
            return true;
        }
        return false;
    }
}