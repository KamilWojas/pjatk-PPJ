class Adres {
    String ulica;
    public Adres(String ulica) { this.ulica = ulica; }
}

class Task19 {
    private String imie;
    private Adres adres;
    private static int liczbaOsob = 0;
    private List<String> telefony = new ArrayList<>();

    public Task19(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
        liczbaOsob++;
    }

    public int getDlugoscImienia() { return imie.length(); } // Atrybut pochodny
}